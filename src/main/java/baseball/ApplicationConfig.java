package baseball;

import baseball.controller.GameController;
import baseball.service.BaseballGameTemplate;
import baseball.service.DefaultGameService;
import baseball.service.GameService;
import baseball.setting.GameSetting;
import baseball.setting.Normal;

public class ApplicationConfig {

    public GameController inject() {
        GameSetting gameSetting = new Normal();
        GameService gameService = new DefaultGameService(gameSetting);
        BaseballGameTemplate<String> baseballGameTemplate = new BaseballGameTemplate<>(gameService);
        return new GameController(baseballGameTemplate);
    }
}
