package com.day8;

public class StringBefferDemo {
	public static void main(String[] args) {
		
		//String Buffer length
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer); //initial capacity of the string buffer is 16
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		//appending and inserting into buffer
		String s;
		int a =42;
		buffer = new StringBuffer(40);
		s =buffer.append("s=").append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuffer("I Java");
		buffer.insert(2, "like ");
		System.out.println(buffer);
		
		buffer.delete(3,6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
	}
}
