package project;

public class PasswordValidator {
	private static final int MINIMUM_COMPLEXITY = 8;
	private static final String SPECIAL_CHARACTER_SET = "!@#$%^&*()-_=+[]{}|;:',.<>?";

	public static boolean validatePassword(String password) {
	  if (password == null || password.length() < MINIMUM_COMPLEXITY) {
	    return false;
	  }

	  int complexityScore = 0;
	  for (char c : password.toCharArray()) {
	    if (Character.isDigit(c)) {
	      complexityScore |= 1; // Flag for number (1st bit)
	    } else if (SPECIAL_CHARACTER_SET.indexOf(c) != -1) {
	      complexityScore |= 2; // Flag for special character (2nd bit)
	    } else if (Character.isUpperCase(c)) {
	      complexityScore |= 4; // Flag for uppercase (3rd bit)
	    }
	  }

	  return complexityScore == (1 | 2 | 4); // Check if all 3 bits are set
	}

}
