package com.day5;

public class hierarchicalmain {
	public static void main(String[] args) {
		Hiearachical person =new Hiearachical();
		System.out.println("---------Person Details---");
		System.out.println(person);
		
		Hiearachical Person1;
		Person1 = new Hiearachical("hgjjg", "Pasgjakisshjtdan");
		System.out.println(Person1);
		
		Person1 =new hierarchicalInheritance("Pdkkdhklka","djdkh","SYBE",564745468);
		System.out.println(Person1);
		
		Person1 =new hierarchicalinheritancedemo("ksll","yuh",5452, 790000, "R");
		System.out.println(Person1);
	}
}
