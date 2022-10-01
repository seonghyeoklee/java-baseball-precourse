package baseball.view.input;

import static baseball.type.GameOverType.getGameOverTypeByInput;
import static baseball.type.GameOverType.isGameOverType;
import static baseball.util.StringUtils.isBlank;

import baseball.type.GameOverType;

public class InputGameOver implements Input<GameOverType> {

    private final String input;

    public InputGameOver(String input) {
        this.input = input;
    }

    @Override
    public void validate() {
        isBlank(this.input);
        isGameOverType(this.input);
    }

    @Override
    public GameOverType create() {
        return getGameOverTypeByInput(this.input);
    }
}
