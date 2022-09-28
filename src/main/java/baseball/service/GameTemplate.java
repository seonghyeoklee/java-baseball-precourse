package baseball.service;

public class GameTemplate {

    private final GameService gameService;

    public GameTemplate(GameService gameService) {
        this.gameService = gameService;
    }

    public void execute(CallBack callBack) {
        // 게임 셋팅 -> 컴퓨터 숫자 셋팅
        gameService.start();

        // 게임 실행 -> 힌트 리턴, 값 입력
        callBack.call();

        // 게임 종료 -> 숫자 초기화
        gameService.end();
    }
}
