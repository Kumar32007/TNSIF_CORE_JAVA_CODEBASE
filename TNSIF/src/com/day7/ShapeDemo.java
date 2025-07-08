package com.day7;

public class ShapeDemo {
	public static void main(String[] args) {
		abstractionClass s;
		s= new Square();
		s.calArea();
		s.show();
		
		s= new Rectangular();
		s.calArea();
		s.show();
		
		s= new Square(25);
		s.calArea();
		s.show();
		
		s= new Rectangular(21.32f,23.12f);
		s.calArea();
		s.show();
		
	}
}
