package com.day10;

public class greaterValueException extends Exception{
	public greaterValueException(String str) {
		super(str);
	}
	public greaterValueException() {
		super("percentage should not be greater than 100");
	}
} 