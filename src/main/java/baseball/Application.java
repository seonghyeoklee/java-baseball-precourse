package baseball;

import baseball.controller.GameController;

public class Application {

    public static void main(String[] args) {
        ApplicationFacade facade = new ApplicationFacade();
        GameController gameController = facade.inject();

        gameController.run();
    }

}
