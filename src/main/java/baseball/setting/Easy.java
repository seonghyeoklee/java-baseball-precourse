package baseball.setting;

public class Easy implements GameSetting {

    @Override
    public int getGameCount() {
        return 20;
    }

    @Override
    public void print() {
        System.out.println("easy");
    }
}
