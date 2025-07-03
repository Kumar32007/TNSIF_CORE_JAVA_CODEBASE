package com.day5;

public class MultipleInheritanceExtends2 extends MultipleINheritanceExtend1{
	
	private String CityName;
	private Float Area;
	
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public Float getArea() {
		return Area;
	}
	public void setArea(Float area) {
		Area = area;
	}
	
	
	@Override
	public String toString() {
		return "MultipleInheritanceExtends2 [CityName=" + CityName + ", Area=" + Area + ", StateName="
				+ getStateName() + ", Language=" + getLanguage()+ ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
	}
	
	
}
