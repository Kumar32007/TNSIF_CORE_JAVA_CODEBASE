package com.day5;

public class InheritanceDemo extends inheritance{
	
//	private String stuentname;
//  private String AdharNumber;

	private int RollNo;
	private String collegeName;
	
	
	public InheritanceDemo() {
		super();
	}

	public InheritanceDemo(String name, String adharNo, String address, long phone,int rollNo, String collegeName) {
		super(name, adharNo, address, phone);
		this.RollNo = rollNo;
		this.collegeName = collegeName;
		
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "InheritanceDemo [RollNo=" + RollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}

	
	
	
	
}
