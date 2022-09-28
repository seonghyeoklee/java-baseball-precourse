package baseball.service;

import static baseball.util.StringUtils.parseInt;

import baseball.domain.Number;
import baseball.domain.PickNumbers;
import baseball.setting.GameSetting;
import camp.nextstep.edu.missionutils.Console;
import java.util.Set;

public class DefaultGameService implements GameService {

    private final GameSetting gameSetting;

    public DefaultGameService(GameSetting gameSetting) {
        this.gameSetting = gameSetting;
    }

    @Override
    public void start() {
        Set<Number> numbers = PickNumbers.getInstance();
        System.out.println("numbers = " + numbers);

        // 난이도에 따라 카운트 변경
        gameSetting.print();

        System.out.print("숫자를 입력해주세요 : ");
        String readLine = Console.readLine();

        Number number = new Number(parseInt(readLine));
        System.out.println("number = " + number);
    }

    @Override
    public void end() {
        PickNumbers.clear();
    }

}
