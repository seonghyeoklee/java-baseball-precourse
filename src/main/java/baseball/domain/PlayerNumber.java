package baseball.domain;

import java.util.HashSet;
import java.util.Set;

public class PlayerNumber {

    private final Set<Number> playerNumbers = new HashSet<>();

    public PlayerNumber(String playerNumber) {
        for (char charAt : playerNumber.toCharArray()) {
            this.playerNumbers.add(new Number(charAt));
        }
    }

    public Set<Number> getPlayerNumbers() {
        return playerNumbers;
    }

    @Override
    public String toString() {
        return "PlayerNumbers{" +
            "numbers=" + playerNumbers +
            '}';
    }
}
