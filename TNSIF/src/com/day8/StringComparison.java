package com.day8;

public class StringComparison {
	public static void main(String[] args) {
		//Creating string with literals pool memory
		String s1 ="TNSIF";
		String s2 ="TNSIF";
		
		
		// == checks the memoory reference 
		
		//Creating string with objects heap memory
		//for object always new memory is initialized 
		String s3 = new String ("TNSIF"); 
		String s4 = new String ("TNSIF");
		
		//.equals checks the data in the string 

		System.out.println("Case 1 :" + (s1==s2)); // true
		System.out.println("Case 2 :" + (s1==s3)); // false
		System.out.println("Case 3 :" + (s1==s4)); // false
		System.out.println("Case 4 :" + (s2==s3)); // false
		System.out.println("Case 5 :" + (s2==s4)); // false
		System.out.println("Case 6 :" + (s3==s4)); // false
		System.out.println("Case 7 :" + (s2.equals(s4))); // true
		System.out.println("Case 8 :" + (s2.equals(s1))); // true
		System.out.println("Case 9 :" + (s2.equals(s3))); // true
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//Compare by using compartTo
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s4));
		System.out.println(s3.compareTo(s4));
		
		System.out.println(s1.compareToIgnoreCase(s4));
	}
}
