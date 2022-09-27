package baseball;

import baseball.controller.GameController;
import baseball.service.GameServiceProxy;

public class Application {

    public static void main(String[] args) {
        GameServiceProxy serviceProxy = new GameServiceProxy();
        GameController gameController = new GameController(serviceProxy);
        gameController.startGame();
    }

}
