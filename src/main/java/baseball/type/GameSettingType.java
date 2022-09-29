package baseball.type;

public enum GameSettingType {
    NUMBER_SIZE(3);

    private final int value;

    GameSettingType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
