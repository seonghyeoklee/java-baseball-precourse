package baseball.domain;

import static baseball.type.GameSettingType.NUMBER_SIZE;
import static baseball.type.NumberRangeType.END_INCLUSIVE;
import static baseball.type.NumberRangeType.START_INCLUSIVE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ComputerNumber {

    private final Set<Number> computerNumbers = new LinkedHashSet<>();

    public void pickNumberInRange() {
        for (int number : getNumbers()) {
            this.computerNumbers.add(new Number(number));
        }
    }

    public List<Integer> toList() {
        List<Integer> result = new ArrayList<>();
        for (Number number : this.computerNumbers) {
            result.add(number.getNumber());
        }
        return result;
    }

    private static Set<Integer> getNumbers() {
        Set<Integer> numbers = new LinkedHashSet<>();
        while (numbers.size() < NUMBER_SIZE.getValue()) {
            numbers.add(
                Randoms.pickNumberInRange(START_INCLUSIVE.getNumber(), END_INCLUSIVE.getNumber())
            );
        }
        return numbers;
    }

    public Set<Number> getComputerNumbers() {
        return computerNumbers;
    }

    @Override
    public String toString() {
        return "ComputerNumber{" +
            "computerNumbers=" + computerNumbers +
            '}';
    }
}
