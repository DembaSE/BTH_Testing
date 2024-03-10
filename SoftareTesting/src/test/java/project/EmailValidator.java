package project;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	private static final String VALID_EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)*[a-zA-Z0-9-]{1,63}(?:\\.[a-zA-Z]{2,7})$";

    private static final Pattern pattern = Pattern.compile(VALID_EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
