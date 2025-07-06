package com.day6;

public class Static_Keyword {
	private int section;//non-static Variables or instnce variables
	private static int srNo; //Static or class variables 
	
	//Static Block
	static {
		System.out.println("--- Static Block --");
		srNo=99;
	  //section = 123; Cannot assign value to non-static variable in the static block
	}

	//Default constructor
	public Static_Keyword() {
		System.out.println("----- Within Default Constructor ---");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "Static_Keyword [Serial No = "+ srNo + " ,section=" + section + "]";
	}
	
	static void Display() {
		//System.out.println("Section="+section);We canot call non static variables in Static  method
		System.out.println("Serial No = " + srNo);
	}
	
}
