package com.day8;

public class Strings {
	public static void main(String[] args) {
		char c[] = {'T','N','S','I','F'};
		String s1 = new String (c);
		System.out.println(s1);
		
		String s2 = new String (s1);
		System.out.println(s2);
		
		String longstr = "This is show \t"+"How long Sentence "+"can be printed.";
		System.out.println(longstr);
		
		//Operations can be performed on string 
		
		String s3 = new String (" INDIA ");
		System.out.println(s3);
		
		String s4 = s3.toLowerCase(); // Uppercase
		System.out.println(s4);
		
		System.out.println(s3.length()); // len6gth start from 1 
		
		System.out.println(s3.substring(3,5)); // In these we give the begininng and end index 
		
		System.out.println(s3.trim());
		
		System.out.println(s3.isEmpty());
		
		System.out.println(s3.stripTrailing());
		
		//String comparison
		
		System.out.println("Case 1:"+ s1.equals(s2));//
		System.out.println("Case 2:"+ s1 == s2); //

		
	}
}
