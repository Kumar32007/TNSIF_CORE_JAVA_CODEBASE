package com.day1;

public class TypeCasting {
	public static void main(String[] args) {
		
		
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f=22.14f;
		double d =f;
		System.out.println(d);
		
		//narrowing //explicit type type casting
		
		double f1= 10.52f;
		long l1 = (long) f1;
		System.out.println(l1);
		
		long l2 =9011096968L;
		int i12=(int)l2;
		System.out.println(i12);
		
		short a=130;
		byte b1=(byte) a;
		System.out.println(b1);
		
				
	}

}
