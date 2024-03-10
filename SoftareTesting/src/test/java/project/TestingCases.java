package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingCases {

	/**
	 * Initaal test case to check if the environmeent is setup 
	 */
	
	@Test
	public void test() {
		addition t=new addition();
		int actual= t.sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}
	
	
	/**
	 * The following tests represent Test-Driven Development (TDD) for a website login page.
	 * 
	 * Test cases include validation of username, email, and password requirements:
	 * - Username must contain at least one capital letter, one special character, and one number.
	 * - Email must follow standard email format (e.g., user@example.com).
	 * - Password must be at least 8 characters long.
	 */ 
	
	
	
	/**
	 * Test cases to validate the email address with regex declared in the EmailValidator class .
	 * 
	 * Methods under test checks if the provided email address 
	 * matches the expected pattern of a valid email address. These tests ensures that
	 * the EmailValidator.isValidEmai.VALID_EMAIL_REGEX  correctly identifies email addresses.
	 */
	
	 	@Test
	    public void testValidEmailWithDotCom() {
	        assertTrue(EmailValidator.isValidEmail("example@email.com"));
	    }

	    @Test
	    public void testValidEmailWithDotCoSe() {
	        assertTrue(EmailValidator.isValidEmail("user123@example.co.se"));
	    }

	    @Test
	    public void testValidEmailWithDashInDomain() {
	        assertTrue(EmailValidator.isValidEmail("user_name123@example-domain.com"));
	    }

	    @Test
	    public void testValidEmailWithDotIo() {
	        assertTrue(EmailValidator.isValidEmail("user@example.io"));
	    }

	    @Test
	    public void testInvalidEmailNotAnEmail() {
	        assertFalse(EmailValidator.isValidEmail("notAnEmail"));
	    }

	    @Test
	    public void testInvalidEmailNoDomain() {
	        assertFalse(EmailValidator.isValidEmail("user@example"));
	    }

	    @Test
	    public void testInvalidEmailNoTopLevelDomain() {
	        assertFalse(EmailValidator.isValidEmail("user@.com"));
	    }

	    @Test
	    public void testInvalidEmailDomainStartingWithSlash() {
	        assertFalse(EmailValidator.isValidEmail("user@/example.com"));
	    }

	    @Test
	    public void testInvalidEmailDomainEndingWithSlash() {
	        assertFalse(EmailValidator.isValidEmail("user@example/.com"));
	    }
	    
	    
	    /**
	     * This test class verifies the UsernameValidator class functionality for various username scenarios,
	     * including valid usernames with capital letters, special characters, and numbers, and invalid usernames
	     * missing one or more of these requirements.
	     */
	    
	    @Test
	    public void testValidUsernameWithCapitalLetterSpecialCharAndNumber() {
	        assertTrue(UsernameValidator.isValid("User@123"));
	    }

	    @Test
	    public void testValidUsernameWithCapitalLetterSpecialCharAndNumber_AnotherExample() {
	        assertTrue(UsernameValidator.isValid("John_Doe@2022"));
	    }

	    @Test
	    public void testValidUsernameWithCapitalLetterSpecialCharAndNumber_AnotherExample2() {
	        assertTrue(UsernameValidator.isValid("Alice#Smith2022"));
	    }

	    @Test
	    public void testInvalidUsername_MissingCapitalLetter() {
	        assertFalse(UsernameValidator.isValid("user"));
	    }

	    @Test
	    public void testInvalidUsername_MissingSpecialCharAndNumber() {
	        assertFalse(UsernameValidator.isValid("Password"));
	    }

	    @Test
	    public void testInvalidUsername_MissingNumber() {
	        assertFalse(UsernameValidator.isValid("User@"));
	    }

	    @Test
	    public void testInvalidUsername_MissingCapitalLetterAndSpecialChar() {
	        assertFalse(UsernameValidator.isValid("user123"));
	    }
}
