package com.day7;

public class overloading_demo {
	public static void main(String[] args) {
		RBI rbi;
		//Dynamic Binding assigning child object to parent class refernce variable
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfInteretst());
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInteretst());
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInteretst());
	}
}
