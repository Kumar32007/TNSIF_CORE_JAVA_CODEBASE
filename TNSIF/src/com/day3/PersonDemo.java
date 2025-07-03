package com.day3;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("Enter person Name: ");
		name = sc.nextLine();
		System.out.println();
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.print("Enter Gender: ");
		String gender=sc.nextLine();
		System.out.println();
		System.out.print("Enter Mobile Number: ");
		long MobileNumber = sc.nextLong();
		System.out.println();
		System.out.print("Enter the Income");
		int Income = sc.nextInt();
		System.out.println();
		
		
		person P = new person();
		P.setName(name);
		P.setAge(age);
		P.setGender(gender);
		P.setMobileNumber(MobileNumber);
		P.setIncome(Income);
		
		//using getter methiod i am reading the data
		System.out.println(P.getName());
		System.out.println(P.getAge());
		System.out.println(P.getGender());
		System.out.println(P.getMobileNumber());
		System.out.println(P.getIncome());
		System.out.println(P.getTax());
		
		
		System.out.println(P);
	
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(P);
		System.out.println("After Calculation of Tax: ");
		System.out.println(P);
	}

}
