package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import baseball.service.BaseballGameTemplate;
import baseball.service.CallBackImpl;
import baseball.service.DefaultGameService;
import baseball.setting.Normal;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberTest {

    @Test
    @DisplayName("숫자가 아닌 경우 예외를 발생한다.")
    void exception_nonNumeric() {
        assertThatIllegalArgumentException()
                .isThrownBy(
                        () -> new Number(11)
                );
    }

    @Test
    void pickNumber() {
        Set<Number> instance = PickNumbers.getInstance();
        System.out.println("pickNumbers.getNumbers() = " + instance);

        Set<Number> instance1 = PickNumbers.getInstance();
        System.out.println("instance1 = " + instance1);
    }

    @Test
    void test() {
        BaseballGameTemplate<String> baseballGameTemplate = new BaseballGameTemplate<>(
            new DefaultGameService(new Normal())
        );
        String execute = baseballGameTemplate.execute(new CallBackImpl());
        System.out.println("execute = " + execute);
    }

}