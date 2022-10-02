package baseball.type;

import static baseball.type.ErrorMessageType.INPUT_NOT_ALLOW_BLANK;
import static baseball.type.ErrorMessageType.INPUT_ONLY_ALLOW_NUMBER;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertEquals;

import baseball.domain.input.Input;
import baseball.domain.input.InputGameOver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class GameOverTypeTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    @DisplayName("게임 종료 여부를 입력할 때 사용자가 입력한 값이 공백이 포함된 경우 IllegalArgumentException 예외가 발생한다.")
    void inputGameOver_notAllowNullOrBlankStrings(String input) {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> {
                Input<GameOverType> inputGameOver = new InputGameOver(input);
                inputGameOver.validate();
            })
            .withMessageContaining(INPUT_NOT_ALLOW_BLANK.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "@", "3"})
    @DisplayName("게임 종료 여부를 입력할 때 사용자가 입력한 값이 1, 2가 아닌 경우 IllegalArgumentException 예외가 발생한다.")
    void inputGameOver_allowOneOrTwoStrings(String input) {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> {
                Input<GameOverType> inputGameOver = new InputGameOver(input);
                inputGameOver.validate();
            })
            .withMessageContaining(INPUT_ONLY_ALLOW_NUMBER.getMessage());
    }

    @ParameterizedTest
    @CsvSource(value = {"1:RESTART", "2:FINISH"}, delimiter = ':')
    @DisplayName("입력한 값이 1이면 RESTART, 2이면 FINISH 를 리턴한다.")
    void test(String input, String expected) {
        GameOverType gameOverType = GameOverType.getGameOverTypeByInput(input);
        assertEquals(expected, gameOverType.name());
    }
}