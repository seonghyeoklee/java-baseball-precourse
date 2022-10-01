package baseball.view.input.factory;

import baseball.domain.PlayerNumber;
import baseball.view.input.Input;

public class DefaultInputFactory implements InputFactory<PlayerNumber> {

    @Override
    public PlayerNumber create(Input<PlayerNumber> input) {
        input.validate();
        return input.create();
    }
}
