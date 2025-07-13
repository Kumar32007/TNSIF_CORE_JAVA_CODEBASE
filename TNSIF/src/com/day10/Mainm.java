package com.day10;

public class Mainm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread c=new ChildThread(10,"4566");
		ChildThread c1=new ChildThread(15,"646");
		c.start();
		c1.start();
		System.out.println("end of the program");
	}

}