package com.day8;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		System.out.println("Outer Interface");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inner Interface");
	}

}
