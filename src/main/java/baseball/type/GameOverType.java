package baseball.type;

import static baseball.type.ErrorMessageType.INPUT_ONLY_ALLOW_NUMBER;

public enum GameOverType {
    RESTART(1),
    FINISH(2),
    ;

    private final int value;

    GameOverType(final int value) {
        this.value = value;
    }

    public static GameOverType isGameOverType(final int input) {
        if (isEquals(RESTART, input)) {
            return RESTART;
        }
        if (isEquals(FINISH, input)) {
            return FINISH;
        }
        throw new IllegalArgumentException(INPUT_ONLY_ALLOW_NUMBER.getMessage());
    }

    private static boolean isEquals(final GameOverType gameOverType, final int input) {
        return gameOverType.getValue() == input;
    }

    public int getValue() {
        return value;
    }
}
