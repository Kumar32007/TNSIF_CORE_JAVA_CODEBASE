package com.day5;
//Parent class,Base class,Super Class

public class inheritance {
	private String name;
	private String AdharNo;
	private String Address;
	private long phone;
	
	public inheritance() {
		System.out.println("Inheritance object is created");
	}

	
	public inheritance(String name, String adharNo, String address, long phone) {
		super();
		this.name = name;
		AdharNo = adharNo;
		Address = address;
		this.phone = phone;
	}

	//getter and setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return AdharNo;
	}

	public void setAdharNo(String adharNo) {
		AdharNo = adharNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	@Override
	public String toString() {
		return "inheritance [name=" + name + ", AdharNo=" + AdharNo + ", Address=" + Address + ", phone=" + phone + "]";
	}
	
	
}
