package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import core.Calculator;
import junit.framework.Assert;

public class CalculatorTest {
	private Calculator classUnderTest;
	 
	@Before
	  public void setUp() throws Exception {
	    this.classUnderTest = new Calculator();
	  }

	  @After
	  public void tearDown() throws Exception {
	    classUnderTest = null;
	  }
	  
	  @Test
	  public void testAdditionFunctionality(){
		  System.out.println("Additon Functionality Test");
		  int expected=20;
		  int actual=classUnderTest.addtestcas(10, 10);
		  Assert.assertEquals(expected, actual);
		  System.out.println("Additon Functionality Working fine");
		  
	  }

	  @Test
	  public void testdivisionFunctionality(){
		  System.out.println("Division Functionality Test");
		  int expected=10;
		  int actual=classUnderTest.division(100, 10);
		  Assert.assertEquals(expected, actual);
		  System.out.println("Division Functionality Working fine");
		  
	  }
	  @Test
	  public void testSubStractFunctionality(){
		  System.out.println("Substract Functionality Test");
		  int expected=20;
		  int actual=classUnderTest.substract(40, 20);
		  Assert.assertEquals(expected, actual);
		  System.out.println("Substract Functionality Working fine");
	  }
}
