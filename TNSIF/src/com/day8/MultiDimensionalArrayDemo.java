package com.day8;

class Marray 
{
	static void printArray(int c [] []) 
	{
		System.out.println("Array Elements are as follows:");
		for(int i =0; i<c.length;i++) 
		{
			for(int j=0;j<c[i].length;j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}




public class MultiDimensionalArrayDemo 
{
	public static void main(String[] args) 
	{
		int c[][]= {{12,34},{10,20},{23,34},{12,56},{123,456}};
		Marray.printArray(c);;
	}
	
	
}
