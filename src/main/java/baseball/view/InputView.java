package baseball.view;

import static baseball.type.ErrorMessageType.INPUT_NOT_ALLOW_BLANK;

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

    private void validate() {
        if (isBlank()) {
            throw new IllegalArgumentException(INPUT_NOT_ALLOW_BLANK.getMessage());
        }
    }

    private boolean isBlank() {
        return isNullOrEmpty() || isWhitespace();
    }

    private boolean isWhitespace() {
        for (int i = 0; i < this.input.length(); i++) {
            char charAt = this.input.charAt(i);
            if (Character.isWhitespace(charAt)) {
                return true;
            }
        }
        return false;
    }

    private boolean isNullOrEmpty() {
        return this.input == null || this.input.length() == 0;
    }

    private int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
