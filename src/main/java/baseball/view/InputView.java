package baseball.view;

import baseball.domain.PlayerNumbers;
import baseball.type.GameEndType;

public class InputView {

    private String input;

    public PlayerNumbers inputNumber(String input) {
        this.input = input;
        validate();
        return new PlayerNumbers(this.input);
    }

    public GameEndType inputRestartOrFinish(String input) {
        this.input = input;
        validate();
        return GameEndType.findByInput(parseInt(this.input));
    }

    public void validate() {
        if (isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isBlank() {
        return this.input == null || this.input.isEmpty();
    }

    private int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
