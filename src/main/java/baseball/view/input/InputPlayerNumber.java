package baseball.view.input;

import static baseball.type.ErrorMessageType.INPUT_ALLOW_JUST_3_DIGIT_NUMBERS;
import static baseball.type.GameSettingType.NUMBER_SIZE;
import static baseball.type.NumberRangeType.validateRange;
import static baseball.util.StringUtils.parseInt;
import static baseball.util.StringUtils.validateBlank;

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
        validateNumber(this.input);
        for (char charAt : input.toCharArray()) {
            validateRange(Character.getNumericValue(charAt));
        }
    }

    @Override
    public PlayerNumber create() {
        return new PlayerNumber(this.input);
    }

    private void validateLength(String input) {
        if (input.length() != NUMBER_SIZE.getValue()) {
            throw new IllegalArgumentException(INPUT_ALLOW_JUST_3_DIGIT_NUMBERS.getMessage());
        }
    }

    private void validateNumber(String input) {
        parseInt(input);
    }
}
