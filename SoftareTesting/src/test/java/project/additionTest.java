package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class additionTest {

	@Test
	public void test() {
		addition t=new addition();
		int actual= t.sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testB() {
		addition t=new addition();
		int actual= t.sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}

}
