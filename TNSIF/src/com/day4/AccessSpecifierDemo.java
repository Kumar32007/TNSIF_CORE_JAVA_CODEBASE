package com.day4;

public class AccessSpecifierDemo {
	public static void main(String[] args) {
		AccessSpecifier a = new AccessSpecifier();
		a.Methoddefault();
		a.methodProtected();
		a.methodPublic();
		
		
		a.vardefault=20;
		a.Methoddefault();
		
		a.varProtected = 100;
		a.methodProtected();
		
		a.varpublic=123;
		a.methodPublic();
	}
}
