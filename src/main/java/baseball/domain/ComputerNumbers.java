package baseball.domain;

import static baseball.type.GameSettingType.NUMBER_SIZE;
import static baseball.type.NumberRangeType.END_INCLUSIVE;
import static baseball.type.NumberRangeType.START_INCLUSIVE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ComputerNumbers {

    private static Set<Number> instance = new HashSet<>();

    private ComputerNumbers() {
    }

    public static void clear() {
        instance.clear();
    }

    public static Set<Number> getInstance() {
        if (instance.isEmpty()) {
            instance = pickNumberInRange();
        }
        return instance;
    }

    private static Set<Number> pickNumberInRange() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < NUMBER_SIZE.getValue()) {
            numbers.add(
                Randoms.pickNumberInRange(START_INCLUSIVE.getNumber(), END_INCLUSIVE.getNumber())
            );
        }
        return numbers.stream()
            .map(Number::new)
            .collect(Collectors.toSet());
    }
}
