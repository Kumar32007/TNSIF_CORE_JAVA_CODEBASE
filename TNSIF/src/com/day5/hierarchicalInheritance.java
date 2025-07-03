package com.day5;

public class hierarchicalInheritance extends Hiearachical {
	private String Class;
	private float person;
	
	public hierarchicalInheritance() {
		System.out.println("Student object default method");
		Class = "B";
		person = 12346;
	}

	public hierarchicalInheritance(String name, String city,String class1, float person) {
		super(name,city);
		Class = class1;
		this.person = person;
	}

	public String getClass() {
		return Class;
	}

	public void setClass(String class1) {
		Class = class1;
	}

	public float getPerson() {
		return person;
	}

	public void setPerson(float person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "hierarchicalInheritance [Class=" + Class + ", person=" + person + ", Name=" + getName()
				+ ", City=" + getCity() + "]";
	}
	
	
}
