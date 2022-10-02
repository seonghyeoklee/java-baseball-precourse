package baseball.view.input;

import static baseball.type.ErrorMessageType.INPUT_NOT_ALLOW_BLANK;
import static baseball.type.GameOverType.getGameOverTypeByInput;
import static baseball.type.GameOverType.isGameOverType;
import static baseball.util.StringUtils.isNullOrEmpty;
import static baseball.util.StringUtils.isWhitespace;

import baseball.type.GameOverType;

public class InputGameOver implements Input<GameOverType> {

    private final String input;

    public InputGameOver(String input) {
        this.input = input;
    }

    @Override
    public void validate() {
        validateBlank(this.input);
        validateGameOverType(this.input);
    }

    @Override
    public GameOverType create() {
        return getGameOverTypeByInput(this.input);
    }

    private void validateBlank(String input) {
        if (isNullOrEmpty(input) || isWhitespace(input)) {
            throw new IllegalArgumentException(INPUT_NOT_ALLOW_BLANK.getMessage());
        }
    }

    private void validateGameOverType(String input) {
        isGameOverType(input);
    }
}
