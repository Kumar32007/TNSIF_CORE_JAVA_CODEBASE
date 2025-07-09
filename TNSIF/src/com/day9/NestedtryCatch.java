package com.day9;

public class NestedtryCatch {
	public static void check() {
		String str = "TNSIF";
		int slength =str.length();
		System.out.println("String length: "+slength);
		String anotherString = null;
		int y =5;
		
		try {
			//inner try block
			try {
				System.out.println(str.charAt(17));
			}
			catch(StringIndexOutOfBoundsException e ) {
				System.err.println(e.getMessage());
			}
			System.out.println("String lengh : "+ anotherString.length());
		}
		catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("Done");
		}
		
		
	}
}
