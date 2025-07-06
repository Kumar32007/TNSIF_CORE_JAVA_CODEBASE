package com.day6;

public class Emplpoyee_Static {
	private String name;
	private int id;
	
	private static String companyName = "TNSIF";

	public Emplpoyee_Static(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emplpoyee_Static [name=" + name + ", id=" + id + " ,CompanyName= "+companyName+ "]";
	}
	
}		
