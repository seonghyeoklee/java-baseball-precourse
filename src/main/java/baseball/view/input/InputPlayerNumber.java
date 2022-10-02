package baseball.view.input;

import static baseball.type.NumberRangeType.validateRange;
import static baseball.util.StringUtils.validateBlank;
import static baseball.util.StringUtils.validateLength;

import baseball.domain.PlayerNumber;

public class InputPlayerNumber implements Input<PlayerNumber> {

    private final String input;

    public InputPlayerNumber(String input) {
        this.input = input;
    }

    @Override
    public void validate() {
        validateBlank(this.input);
        validateLength(this.input);
        for (char charAt : input.toCharArray()) {
            validateRange(Character.getNumericValue(charAt));
        }
    }

    @Override
    public PlayerNumber create() {
        return new PlayerNumber(this.input);
    }
}
