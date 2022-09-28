package baseball.domain;

import static baseball.domain.PickNumberRangeType.validateRange;

public class Number {

    private final int number;

    public Number(final int number) {
        validate(number);
        this.number = number;
    }

    private void validate(final int number) {
        validateRange(number);
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
