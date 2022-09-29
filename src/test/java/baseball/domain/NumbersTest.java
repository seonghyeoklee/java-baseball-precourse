package baseball.domain;

import static baseball.type.ValueType.NUMBER_SIZE;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void 컴퓨터_수는_최초에_한번_생성된다() {
        Set<Number> firstNumbers = Numbers.getInstance();
        Set<Number> secondNumbers = Numbers.getInstance();
        assertThat(firstNumbers).isEqualTo(secondNumbers);
    }

    @Test
    void 중복되지_않는_3자리_수가_생성된다() {
        Set<Number> numbers = Numbers.getInstance();
        assertThat(numbers.size()).isEqualTo(NUMBER_SIZE.getValue());
    }

}