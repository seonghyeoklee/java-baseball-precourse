package baseball.controller;

import baseball.service.BaseballGameTemplate;
import baseball.service.CallBack;

public class GameController {

    private final BaseballGameTemplate<String> template;

    public GameController(BaseballGameTemplate<String> template) {
        this.template = template;
    }

    public void run(CallBack<String> callBack) {
        template.execute(callBack);
    }

}
