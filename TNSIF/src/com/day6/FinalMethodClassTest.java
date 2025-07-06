package com.day6;

public class FinalMethodClassTest extends Final_Method_Class{
	
//	@Override
//	void show(){
//		System.out.println("This is inal Merthod of a parent class");
//	}  We cannot Overide fial method 
	
	void display() {
		System.out.println("Method created in the Final Method Class Test ");
	}
	
	public static void main(String[] args) {
		FinalMethodClassTest F2 =new FinalMethodClassTest();
		F2.display();
		F2.show();
	}
}
