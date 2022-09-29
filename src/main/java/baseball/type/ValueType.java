package baseball.type;

public enum ValueType {
    NUMBER_SIZE(3);

    private final int value;

    ValueType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
