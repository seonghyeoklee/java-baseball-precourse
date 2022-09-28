package baseball;

import baseball.controller.GameController;
import baseball.service.CallBackImpl;

public class Application {

    public static void main(String[] args) {
        ApplicationConfig config = new ApplicationConfig();
        GameController gameController = config.inject();

        gameController.run(new CallBackImpl());
    }

}
