package com.day6;

public class Static_main {
	public static void main(String[] args) {
		
		Static_Keyword.Display();
		System.out.println();
		
		Static_Keyword s =new Static_Keyword();
		System.out.println(s);
		
		Static_Keyword s1 =new Static_Keyword();
		System.out.println(s1);
		Static_Keyword.Display();
		
		Static_Keyword s2 =new Static_Keyword();
		System.out.println(s2);
		Static_Keyword.Display();

	}
}
