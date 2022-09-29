package baseball.domain;

import java.util.HashSet;
import java.util.Set;

public class PlayerNumbers {

    private final Set<Number> numbers;

    public PlayerNumbers(String input) {
        this.numbers = new HashSet<>();
    }
    
    public Set<Number> getNumbers() {
        return numbers;
    }
}
