package baseball.view.input.factory;

import baseball.view.input.Input;

public interface InputFactory<T> {

    T create(Input<T> input);

}
