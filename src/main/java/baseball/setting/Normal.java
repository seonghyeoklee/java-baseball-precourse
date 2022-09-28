package baseball.setting;

public class Normal implements GameSetting {

    @Override
    public int getGameCount() {
        return 10;
    }

    @Override
    public void print() {
        System.out.println("normal");
    }
}
