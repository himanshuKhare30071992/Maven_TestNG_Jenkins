package javaBasicProgramsClasses;

public class FactorialProgram 
{
		
		public void factorialOf(int number)  //5
		{
			int result=1;
			for(int i=2; i<=number; i++)
			{
					 result = result * i; //2, 6, 24, 120    
			}
			System.out.println("==================Factorial of "+number+ " is "+result+"===============");
		}
		
		
		
		
		
		public void additionOf(int num1, int num2)
		{
			System.out.println("============SUM OF "+num1+" and "+num2+" is =========="+num1+num2);
		}
}
