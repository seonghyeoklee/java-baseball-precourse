package baseball.service;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("Start Game!");
    }

}
