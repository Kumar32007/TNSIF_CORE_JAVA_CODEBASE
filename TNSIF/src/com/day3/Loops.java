package com.day3;
public class Loops {
	public static void main(String [] args) {
		//For Loop 
		for(int i=1;i<=100;i++) {
			System.out.println("Value of i:"+i);
		}
		
		
		int i =90;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		
		
		
		int j = 101;
		do {
			System.out.println(j);
		}while(j<=100);
		
		
		int [] a= {1,2,3,4,5};
		for (int num : a) {
			System.out.println(num);
		}
		
	}
}
