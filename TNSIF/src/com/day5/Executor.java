package com.day5;

public class Executor {
	
	public static void main(String[] args) {
		
		Address a = new Address("hkjgjb","Pune","Maharashtra",463562);
		
		Person p =new Person("hgjjn",a);
		p.displayInfo();
		System.out.println(p);
	}

}
