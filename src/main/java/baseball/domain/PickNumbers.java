package baseball.domain;

import static baseball.domain.PickNumberRangeType.END_INCLUSIVE;
import static baseball.domain.PickNumberRangeType.START_INCLUSIVE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PickNumbers {

    private static Set<Number> instance = new HashSet<>();

    private PickNumbers() {
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
        while (numbers.size() < 3) {
            numbers.add(
                    Randoms.pickNumberInRange(START_INCLUSIVE.getNumber(), END_INCLUSIVE.getNumber())
            );
        }
        return numbers.stream()
                .map(Number::new)
                .collect(Collectors.toSet());
    }
}
