package com.day7;

public class Rectangular extends abstractionClass {
	float width;
	float height;
	
	public Rectangular() {
		width = 12.3f;
		height =22.1f;
	}

	public Rectangular(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
 
	@Override
	public String toString() {
		return "Rectangular [width=" + width + ", height=" + height + "]";
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area = width * height;
	}
	
}
