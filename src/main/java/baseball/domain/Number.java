package baseball.domain;

public class Number {

    private final int number;

    public Number(final int number) {
        validate(number);
        this.number = number;
    }

    private void validate(final int number) {
        // TODO: 유효성 체크
    }

    public int getNumber() {
        return number;
    }
}
