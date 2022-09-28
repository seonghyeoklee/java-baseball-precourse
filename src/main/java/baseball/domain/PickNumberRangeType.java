package baseball.domain;

public enum PickNumberRangeType {
    START_INCLUSIVE(1),
    END_INCLUSIVE(9),
    ;

    private final int number;

    PickNumberRangeType(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void validateRange(final int number) {
        if (number < START_INCLUSIVE.getNumber()) {
            throw new IllegalArgumentException(
                    String.format("number cannot be less than %d", START_INCLUSIVE.getNumber())
            );
        }
        if (number > END_INCLUSIVE.getNumber()) {
            throw new IllegalArgumentException(
                    String.format("number cannot be greater than %d", END_INCLUSIVE.getNumber())
            );
        }
    }

}
