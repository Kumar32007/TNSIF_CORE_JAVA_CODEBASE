package com.day9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divicion {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers :");
		try {
			a =sc.nextInt();
			b =sc.nextInt();;
			c=a/b;
			System.out.println("Division is c: "+c);			
		}
		catch(InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		finally {
			System.out.println("Thank You");
		}
	}
}
