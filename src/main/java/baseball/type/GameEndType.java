package baseball.type;

public enum GameEndType {
    RESTART(1),
    FINISH(2);

    private final int value;

    GameEndType(int value) {
        this.value = value;
    }

    public static GameEndType findByInput(int input) {
        for (GameEndType gameEndType : GameEndType.values()) {
            if (gameEndType.getValue() == input) {
                return gameEndType;
            }
        }
        throw new IllegalArgumentException();
    }

    public int getValue() {
        return value;
    }
}
