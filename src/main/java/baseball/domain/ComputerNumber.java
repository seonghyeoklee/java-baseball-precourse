package baseball.domain;

import static baseball.type.GameSettingType.NUMBER_SIZE;
import static baseball.type.NumberRangeType.END_INCLUSIVE;
import static baseball.type.NumberRangeType.START_INCLUSIVE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.Set;

public class ComputerNumber {

    private final Set<Number> computerNumbers = new HashSet<>();

    public Set<Number> pickNumberInRange() {
        for (int number : getNumbers()) {
            this.computerNumbers.add(new Number(number));
        }
        return computerNumbers;
    }

    private static Set<Integer> getNumbers() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < NUMBER_SIZE.getValue()) {
            numbers.add(
                Randoms.pickNumberInRange(START_INCLUSIVE.getNumber(), END_INCLUSIVE.getNumber())
            );
        }
        return numbers;
    }
}
