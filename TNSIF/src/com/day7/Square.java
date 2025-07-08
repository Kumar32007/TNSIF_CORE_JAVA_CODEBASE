package com.day7;

public class Square extends abstractionClass {
	
	float side;
	
	
	public Square() {
		side = 24.3f;
	}


	public Square(float side) {
		super();
		this.side = side;
	}
	
	

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}


	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area = side * side;
	}

}
