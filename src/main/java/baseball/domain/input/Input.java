package baseball.domain.input;

public interface Input<T> {

    void validate();

    T create();

}
