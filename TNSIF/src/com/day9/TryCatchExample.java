package com.day9;

public class TryCatchExample 
{
	public static void PerformDivision(int x,int y) 
	{
		System.out.println("I am in Method.");
		try {
			System.out.println("I am in Try block");
			int z=x/y;
			System.out.println("Result of Divion is :" + z);
		}
		catch (ArithmeticException e) {
			System.err.println("I am in Catch Block :"+e.getMessage());
		}
		
		
		
	}
}
