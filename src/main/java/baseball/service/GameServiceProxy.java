package baseball.service;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {
        System.out.println("=======================================");
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        this.gameService.startGame();
        System.out.println("=======================================");
    }
}
