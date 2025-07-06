package com.day6;

final class FinalClass{
	
	void show() {
		System.out.println("Final Class Cannot be inherited");
	}
}

//clas Student extends FinalClass{
//	
//} We Cannot Extend Final Class Also


public class FinalClassDemo {
	public static void main(String[] args) {
		FinalClass F =new FinalClass();
		F.show();
	}
}
