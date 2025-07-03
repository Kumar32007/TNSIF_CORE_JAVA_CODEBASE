package com.day5;

public class Hiearachical {
	private String Name;
	private String City;
	
	
	public Hiearachical() {
		System.out.println("Person class Default Method");
		Name = "Devesh";
		City ="Pune";
	}

	public Hiearachical(String name, String city) {
		Name = name;
		City = city;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Hiearachical [Name=" + Name + ", City=" + City + "]";
	}
	
	
	
}
