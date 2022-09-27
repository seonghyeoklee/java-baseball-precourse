package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberTest {

    @Test
    @DisplayName("숫자가 아닌 경우 예외를 발생한다.")
    void exception_nonNumeric() {
        assertThatIllegalArgumentException()
            .isThrownBy(
                () -> new Number(4)
            );
    }

}