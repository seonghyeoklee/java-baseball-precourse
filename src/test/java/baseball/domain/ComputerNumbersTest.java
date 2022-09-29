package baseball.domain;

import static baseball.type.GameSettingType.NUMBER_SIZE;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;

class ComputerNumbersTest {

    @Test
    void 컴퓨터_수는_최초에_한번_생성된다() {
        Set<Number> firstNumbers = ComputerNumbers.getInstance();
        Set<Number> secondNumbers = ComputerNumbers.getInstance();
        assertThat(firstNumbers).isEqualTo(secondNumbers);
    }

    @Test
    void 중복되지_않는_3자리_수가_생성된다() {
        Set<Number> numbers = ComputerNumbers.getInstance();
        assertThat(numbers.size()).isEqualTo(NUMBER_SIZE.getValue());
    }

}