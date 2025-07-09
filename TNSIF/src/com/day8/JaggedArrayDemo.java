package com.day8;

class JaggedArray 
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


public class JaggedArrayDemo 
{
		public static void main(String[] args) 
		{
			int c[][]= {{12,34},{10},{23,34},{12,56,76},{123,456,678,90}};
			JaggedArray.printArray(c);
			
			
			for(int i =1;i<=10;i++) {
				System.out.println(i);
				if(i ==3) {
//					System.out.println(i);
					continue;
				}
//				System.out.println(i);
			}
		}
		
		
		
}

