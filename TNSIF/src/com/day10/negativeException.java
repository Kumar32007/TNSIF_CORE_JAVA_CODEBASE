package com.day10;
public class negativeException extends Exception{
	public negativeException(String str) {
		super(str);
	}
	public negativeException() {
		super("percentage should not be negative");
	}
	
} 