package baseball.type;

public enum ErrorMessageType {
    LESS_THAN_START_INCLUSIVE("number cannot be less than startInclusive"),
    GREATER_THAN_END_INCLUSIVE("number cannot be greater than endInclusive"),
    INPUT_NOT_ALLOW_BLANK("input not allow blank");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
