package baseball.view.input;

import static baseball.type.GameOverType.getGameOverTypeByInput;
import static baseball.type.GameOverType.validateGameOverType;
import static baseball.util.StringUtils.validateBlank;

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
}
