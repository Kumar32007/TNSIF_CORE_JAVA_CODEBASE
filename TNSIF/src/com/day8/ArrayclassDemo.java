package com.day8;

import java.util.Arrays;

public class ArrayclassDemo {
	public static void main(String[] args) {
		
		//get the array
		int intArr[]= {69,20,12,40,35};
		
		//Print the array
		System.out.println(Arrays.toString(intArr));/// by using these we can put the element in the array formt 
		
		for(int i =0;i< intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		System.out.println();
		
		//Sort 
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binary Search
		System.out.println(Arrays.binarySearch(intArr,1000));
		System.out.println(Arrays.binarySearch(intArr,40));

		
		//get the second array
		int intArr1[]= {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr1);
		
		if(Arrays.compare(intArr, intArr1) == 0) {
			System.out.println("Both arrays are same");
		}else {
			System.out.println("Both arrays are not same");
		}
		
		//Copy of an arrays
		
		int intArr2[]= Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]= Arrays.copyOfRange(intArr1, 2,4);
		System.out.println(Arrays.toString(intArr3));
		
		
		//fill Method 
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));

		
		
	}
}
