package baseball.view.input;

public interface Input<T> {

    void validate();

    T create();

}
