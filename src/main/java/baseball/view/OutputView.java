package baseball.view;

import static baseball.type.GameMessageType.FINISH;
import static baseball.type.GameMessageType.RESTART_OR_FINISH;
import static baseball.type.GameMessageType.START;

public class OutputView {

    public void printStart() {
        System.out.print(START.getMessage());
    }

    public void printFinish() {
        System.out.print(FINISH.getMessage());
    }

    public void printRestartOrFinish() {
        System.out.print(RESTART_OR_FINISH.getMessage());
    }
}
