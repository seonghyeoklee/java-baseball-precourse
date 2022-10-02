package baseball.domain;

import java.util.List;

public class Hint {

    private int strike;
    private int ball;

    public void count(PlayerNumber playerNumber, ComputerNumber computerNumber) {
        isSameNumber(playerNumber, computerNumber);
        isSamePosition(playerNumber, computerNumber);
    }

    private void isSameNumber(PlayerNumber playerNumber, ComputerNumber computerNumber) {
        for (Number number : playerNumber.getPlayerNumbers()) {
            countSameNumber(computerNumber.toList(), number);
        }
    }

    private void isSamePosition(PlayerNumber playerNumber, ComputerNumber computerNumber) {
        List<Integer> playerNumbers = playerNumber.toList();
        List<Integer> computerNumbers = computerNumber.toList();
        for (int i = 0; i < playerNumbers.size(); i++) {
            countSamePosition(playerNumbers, computerNumbers, i);
        }
    }

    private void countSameNumber(List<Integer> computerNumber, Number number) {
        if (computerNumber.contains(number.getNumber())) {
            ball++;
        }
    }

    private void countSamePosition(
        List<Integer> playerNumbers,
        List<Integer> computerNumbers,
        int index
    ) {
        if (playerNumbers.get(index).equals(computerNumbers.get(index))) {
            strike++;
            ball--;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    @Override
    public String toString() {
        return "Hint{" +
            "strike=" + strike +
            ", ball=" + ball +
            '}';
    }
}
