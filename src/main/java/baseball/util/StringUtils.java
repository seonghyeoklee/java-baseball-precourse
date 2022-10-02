package baseball.util;

import static baseball.type.ErrorMessageType.INPUT_ONLY_ALLOW_NUMBER;

public class StringUtils {

    public static int parseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INPUT_ONLY_ALLOW_NUMBER.getMessage());
        }
    }

    public static boolean isWhitespace(String input) {
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (Character.isWhitespace(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(String input) {
        return input == null || input.length() == 0;
    }

}
