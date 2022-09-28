package baseball.service;

import baseball.domain.Number;
import baseball.domain.PickNumbers;
import baseball.setting.GameSetting;
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

    }

    @Override
    public void end() {
        PickNumbers.clear();
    }
}
