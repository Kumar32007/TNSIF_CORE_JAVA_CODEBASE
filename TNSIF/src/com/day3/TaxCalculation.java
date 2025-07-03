package com.day3;

public class TaxCalculation {
	public void calculateTax(person p) 
	{
		if(p.getAge() > 65 || p.getGender().equalsIgnoreCase("female"))
		{
			p.setTax(0);
			System.out.println("Tax is not applicale to Female or age greater than the 65 Years");
		}
		else
		{
			if(p.getIncome() <= 160000)
			{
				p.setTax(0);
				System.out.println("Tax is not Applicable for income less than 160000");
			}
			else if(p.getIncome() >160000 && p.getIncome()<=500000)
			{
				p.setTax((p.getIncome() - 160000)*10/100);
				System.out.println("10% Tax is applicable for income between the 160000 to 50000");
			}
			else if(p.getIncome() >500000 && p.getIncome()<=800000)
			{
				p.setTax((p.getIncome() - 500000)*20/100 + 34000);
				System.out.println("20% Tax is applicable for income between the 500000 to 800000");
			}
			else {
				p.setTax((p.getIncome() - 800000)*30/100 + 94000);
				System.out.println("30% Tax is applicable for income greater than the 800000");
			}
			
		}
	}
}
