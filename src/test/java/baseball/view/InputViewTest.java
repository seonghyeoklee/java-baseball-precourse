package baseball.view;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputViewTest {

    @DisplayName("사용자가 입력한 값에 공백이 있는 경우 IllegalArgumentException 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    void inputNumber_NotAllowNullOrBlankStrings(String input) {
        assertThatIllegalArgumentException()
            .isThrownBy(
                () -> {
                    InputView view = new InputView();
                    view.inputNumber(input);
                }
            );
    }
}