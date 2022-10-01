package baseball.domain;

import static baseball.type.ErrorMessageType.INPUT_NOT_ALLOW_BLANK;
import static baseball.type.ErrorMessageType.LESS_THAN_START_INCLUSIVE;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import baseball.view.input.Input;
import baseball.view.input.InputPlayerNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerNumberTest {

    @ParameterizedTest
    @ValueSource(strings = {"014", "104", "140"})
    @DisplayName("시작 범위의 수보다 입력한 수가 작으면 IllegalArgumentException 예외가 발생한다.")
    void inputPlayerNumber_notAllowLessThanStartInclusive(String input) {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> {
                Input<PlayerNumber> inputPlayerNumber = new InputPlayerNumber(input);
                inputPlayerNumber.validate();
            })
            .withMessageContaining(LESS_THAN_START_INCLUSIVE.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    @DisplayName("사용자가 입력한 값에 공백이 있는 경우 IllegalArgumentException 예외가 발생한다.")
    void inputPlayerNumber_notAllowNullOrBlankStrings(String input) {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> {
                Input<PlayerNumber> inputPlayerNumber = new InputPlayerNumber(input);
                inputPlayerNumber.validate();
            })
            .withMessageContaining(INPUT_NOT_ALLOW_BLANK.getMessage());
    }
}