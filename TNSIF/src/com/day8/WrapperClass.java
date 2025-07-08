package com.day8;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Autio-generated method stub
		//Inboxing 
		Integer i= new Integer(10);
		System.out.println(i);
		
		//By using int value()
		int b = i.intValue();
		System.out.println(b);
		
		//By without using int value()
		int c =i;
		System.out.println(c);
		
		//Autoboxing 
		int a =100;
		Integer i1 =a;
		System.out.println(i1);
	}

}
