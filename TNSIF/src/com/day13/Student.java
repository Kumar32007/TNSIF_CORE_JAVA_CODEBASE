package com.day13;

public class Student {
	private int id;
	private String Name;
	private double per;
	
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		Name = name;
		this.per = per;
	} 
	
	public int getId() {
		return id;
	} 
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public double getPer() {
		return per;
	}
	
	public void setPer(double per) {
		this.per = per;
	} 
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", per=" + per + "]";
	}
	
}
