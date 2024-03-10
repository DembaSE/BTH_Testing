package project;

public class UsernameValidator {

	// Regular expression containing all the special characters allowed in username
	private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:',.<>?";
	
	 /**
     * Validates a username based on the following criteria:
     *  - Must not be null or empty
     *  - Must contain at least one capital letter (A-Z)
     *  - Must contain at least one number (0-9)
     *  - Must contain at least one special character from the allowed set
     *
     * @param username The username to validate
     * @return True if the username is valid, False otherwise
     */
	public static boolean isValid(String username) {
		if (username == null || username.isEmpty()) {
			return false;
		}

		boolean hasCapitalLetter = false;
		boolean hasNumber = false;
		boolean hasSpecialChar = false;

		for (char c : username.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasCapitalLetter = true;
			} else if (Character.isDigit(c)) {
				hasNumber = true;
			} else if (SPECIAL_CHARS.indexOf(c) != -1) {
				hasSpecialChar = true;
			}
		}

		return hasCapitalLetter && hasNumber && hasSpecialChar;
	}

}
