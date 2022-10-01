package baseball.view.input;

import static baseball.type.NumberRangeType.validateRange;
import static baseball.util.StringUtils.isBlank;

import baseball.domain.PlayerNumber;

public class InputPlayerNumber implements Input<PlayerNumber> {

    private final String playerNumber;

    public InputPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    @Override
    public void validate() {
        isBlank(this.playerNumber);
        for (char charAt : playerNumber.toCharArray()) {
            validateRange(Character.getNumericValue(charAt));
        }
    }

    @Override
    public PlayerNumber create() {
        return new PlayerNumber(this.playerNumber);
    }
}
