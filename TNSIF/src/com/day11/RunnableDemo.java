package com.day11;

public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new UsingRunnable(10,1,"hiii");
		Thread t1=new Thread(r);
		t1.start();
		
		
		
//		
//		Runnable r1 =() -> System.out.println("Runnable with lambda");
//		new Thread(r1).start();
	}
}
