package testJavaPrograms;

import org.testng.annotations.Test;

import javaBasicProgramsClasses.FactorialProgram;

public class Factorial_TestCase extends FactorialProgram{

	
	FactorialProgram fp = new FactorialProgram();

	
@Test
  public void factorialTestCase() 
	{
		fp.factorialOf(5);
	}
}
