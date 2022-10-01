package baseball.util;

import static baseball.type.ErrorMessageType.INPUT_NOT_ALLOW_BLANK;
import static baseball.type.ErrorMessageType.INPUT_ONLY_ALLOW_NUMBER;

public class StringUtils {

    public static int parseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INPUT_ONLY_ALLOW_NUMBER.getMessage());
        }
    }

    public static void isBlank(String input) {
        if (isNullOrEmpty(input) || isWhitespace(input)) {
            throw new IllegalArgumentException(INPUT_NOT_ALLOW_BLANK.getMessage());
        }
    }

    private static boolean isWhitespace(String input) {
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (Character.isWhitespace(charAt)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNullOrEmpty(String input) {
        return input == null || input.length() == 0;
    }

}
