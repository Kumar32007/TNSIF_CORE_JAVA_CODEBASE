package com.day3;

import java.util.Scanner;

public class NestedForLoops {
	public static void main(String []args) {

	
		System.out.println("Enter a number of rows");
		Scanner sc = new Scanner(System.in);
		int Rows = sc.nextInt();
		for(int i =1;i<=Rows;i++) {
			for(int j =1;j<=i;j++) {
				if(j ==1|| j==i||i==Rows) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
