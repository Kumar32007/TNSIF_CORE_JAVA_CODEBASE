package com.day8;

public interface OuterInterface {
	void calArea();
	
	interface InnerInterface{
		int id= 20;
		void print();
	}
}
