package testJavaPrograms;

import org.testng.annotations.Test;

import javaBasicProgramsClasses.FactorialProgram;

public class Addition_TestCase extends FactorialProgram{

	
	FactorialProgram fp = new FactorialProgram();

	
@Test
  public void additionTestCase() 
	{
		fp.additionOf(20,40);
	}
}
