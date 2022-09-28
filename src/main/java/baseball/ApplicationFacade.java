package baseball;

import baseball.controller.GameController;
import baseball.service.DefaultGameService;
import baseball.service.GameService;
import baseball.setting.GameSetting;
import baseball.setting.Normal;

public class ApplicationFacade {

    public GameController inject() {
        GameSetting gameSetting = new Normal();
        GameService gameService = new DefaultGameService(gameSetting);
        return new GameController(gameService);
    }
}
