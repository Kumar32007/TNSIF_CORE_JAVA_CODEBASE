package com.day7;

public class Constructor_overloading_main {
	public static void main(String[] args) {
		Constructor_Overloading c =new Constructor_Overloading(); //Default Para
		System.out.println(c);
		Constructor_Overloading c1 =new Constructor_Overloading(2.3f); //Parameterized para
		System.out.println(c1);
		Constructor_Overloading c2 =new Constructor_Overloading(12.3f,123.4f);
		System.out.println(c2);

		
		//Method Overloading
		
		System.out.println("-------Method Overloading ----------");
		System.out.println(Method_Overloading.addition(12, 13));
		System.out.println(Method_Overloading.addition(12, 34, 23));		
		System.out.println(Method_Overloading.addition(123.43f, 1256.22f));
		System.out.println(Method_Overloading.addition(7889.84f, 2873.54f,87362.3f));
		}
}
