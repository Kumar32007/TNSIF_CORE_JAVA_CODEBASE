package com.day5;

public class MultipleINheritanceExtend1 extends multipleInheritance {
	private String StateName;
	private String Language;
	
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	
	
	@Override
	public String toString() {
		return "MultipleINheritanceExtend1 [StateName=" + StateName + ", Language=" + Language + ", CountryName="
				+ getCountryName() + ", Capital=" + getCapital() + ", String=" + super.toString() + "]";
	}
	
	
}
