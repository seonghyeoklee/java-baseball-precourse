package baseball.domain;

import static baseball.type.NumberRangeType.validateRange;

public class Number {
    private final int number;

    public Number(final int number) {
        validate(number);
        this.number = number;
    }

    private void validate(final int number) {
        validateRange(number);
    }

    public int getNumber() {
        return number;
    }
}