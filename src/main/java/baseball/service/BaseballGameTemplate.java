package baseball.service;

public class BaseballGameTemplate<T> {

    private final GameService gameService;

    public BaseballGameTemplate(GameService gameService) {
        this.gameService = gameService;
    }

    public T execute(CallBack<T> callback) {
        // 게임 셋팅 -> 컴퓨터 숫자 셋팅
        gameService.start();

        // 게임 실행 -> 힌트 리턴, 값 입력
        T result = callback.call();

        // 게임 종료 -> 숫자 초기화
        gameService.end();
        return result;
    }

}
