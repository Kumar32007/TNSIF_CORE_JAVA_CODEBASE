package com.day7;

public class Constructor_Overloading {
	private float x ;
	private float y;
	
	public Constructor_Overloading() {
		 x = 0.0f;
		 y = 0.1f;
	}

	public Constructor_Overloading(float x) {
		this.x = x;
	}

	public Constructor_Overloading(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Constructor_Overloading [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
