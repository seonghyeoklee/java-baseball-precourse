package baseball.domain;

import static baseball.type.ErrorMessageType.GREATER_THAN_END_INCLUSIVE;
import static baseball.type.ErrorMessageType.LESS_THAN_START_INCLUSIVE;
import static baseball.type.NumberRangeType.END_INCLUSIVE;
import static baseball.type.NumberRangeType.START_INCLUSIVE;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

class NumberTest {

    @Test
    void 시작_범위의_수보다_작으면_예외가_발생한다() {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> new Number(START_INCLUSIVE.getNumber() - 1))
            .withMessageContaining(LESS_THAN_START_INCLUSIVE.getMessage());
    }

    @Test
    void 마지막_범위의_수보다_크면_예외가_발생한다() {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> new Number(END_INCLUSIVE.getNumber() + 1))
            .withMessageContaining(GREATER_THAN_END_INCLUSIVE.getMessage());
    }

}