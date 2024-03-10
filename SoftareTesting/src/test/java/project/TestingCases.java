package project;

import static org.junit.Assert.*;

import org.junit.Before;
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
	 * The following tests represent Test-Driven Development (TDD) for a E commerce website login page.
	 * Test cases include validation of username, email, and password requirements:
	 * - Username must contain at least one capital letter, one special character, and one number.
	 * - Email must follow standard email format (e.g. @email.com).
	 * - Password must be at least 8 characters long and field.
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
	        assertTrue(EmailValidator.isValidEmail("demba24@example.co.se"));
	    }

	    @Test
	    public void testValidEmailWithDashInDomain() {
	        assertTrue(EmailValidator.isValidEmail("user_name123@example-domain.com"));
	    }

	    @Test
	    public void testValidEmailWithDotCom1() {
	        assertTrue(EmailValidator.isValidEmail("Demba@gmail.com"));
	    }

	    @Test
	    public void testInvalidEmailNotAnEmail() {
	        assertFalse(EmailValidator.isValidEmail("notAnEmail"));
	    }

	    @Test
	    public void testInvalidEmailNoDomain() {
	        assertFalse(EmailValidator.isValidEmail("demba@example"));
	    }

	    @Test
	    public void testInvalidEmailNoTopLevelDomain() {
	        assertFalse(EmailValidator.isValidEmail("demba@.com"));
	    }

	    @Test
	    public void testInvalidEmailDomainStartingWithSlash() {
	        assertFalse(EmailValidator.isValidEmail("demba@/example.com"));
	    }

	    @Test
	    public void testInvalidEmailDomainEndingWithSlash() {
	        assertFalse(EmailValidator.isValidEmail("demba@example/.com"));
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
	        assertTrue(UsernameValidator.isValid("John_Doe24@google"));
	    }

	    @Test
	    public void testValidUsernameWithCapitalLetterSpecialCharAndNumber_AnotherExample2() {
	        assertTrue(UsernameValidator.isValid("Paul#Smith2022"));
	    }

	    @Test
	    public void testInvalidUsername_MissingCapitalLetter() {
	        assertFalse(UsernameValidator.isValid("user"));
	    }

	    @Test
	    public void testInvalidUsername_MissingSpecialCharAndNumber() {
	        assertFalse(UsernameValidator.isValid("mARCHAD"));
	    }

	    @Test
	    public void testInvalidUsername_MissingNumber() {
	        assertFalse(UsernameValidator.isValid("UserSE@"));
	    }

	    @Test
	    public void testInvalidUsername_MissingCapitalLetterAndSpecialChar() {
	        assertFalse(UsernameValidator.isValid("user123"));
	    }
	    
	    
	    @Test
	    public void testInvalidPassword_MissingComplexity() {
	      String password = "pori123"; // Password with less than minimum length and only digits
	      assertFalse(PasswordValidator.validatePassword(password));
	    }

	    @Test
	    public void testInvalidPassword_SequentialCharacters() {
	      String password = "sweden123"; // Password with sequential lowercase letters and numbers
	      assertFalse(PasswordValidator.validatePassword(password));
	    }

	    @Test
	    public void testValidPassword_StrongPassword() {
	      String password = "Da$$w0rd1984!"; // Password with uppercase, lowercase, number, and special character
	      assertTrue(PasswordValidator.validatePassword(password));
	    }
	    
	    
	    /**
	     * Test cases for the Basket class, which manages products.
	     * These tests ensure that the Basket class behaves as expected, including adding and removing products,
	     * as well as calculating the total price of products in the basket.
	     */
	    
	    private Basket basket;
	    /**
	     * Sets up the test environment before each test method is executed.
	     * Initializes a new Basket instance.
	     */
	    @Before
	    public void setUp() {
	        basket = new Basket();
	    }

	    @Test
	    public void testAddProduct() {
	        basket.addProduct("Apple Iphone", 1099.99);
	        assertEquals(1, basket.getProductCount());
	    }

	    @Test
	    public void testRemoveProduct() {
	        basket.addProduct("Apple Watch", 4990.99);
	        basket.removeProduct("Apple Watch");
	        assertEquals(0, basket.getProductCount());
	    }
	    
	    @Test
	    public void testTotalRightPrice() {
	        basket.addProduct("Apple TV", 2598.99);
	        basket.addProduct("Samsung Galaxy s23 Ultra", 1499.99);
	        basket.addProduct("Netflix subscription", 147.49);
	        assertEquals(4246.47, basket.getTotalPrice(), 0.01); // give a right total price 
	    }

	   
	    
	   
}
