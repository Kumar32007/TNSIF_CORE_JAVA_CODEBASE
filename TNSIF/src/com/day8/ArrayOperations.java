package com.day8;

public class ArrayOperations {

    // Print the array
    static void PrintArray1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(); // Print newline after printing the array
    }

    // Sum of variable number of integers
    public static int getSum(int... n) {
        int sum = 0;
        for (int no : n) {
            sum += no;
        }
        return sum;
    }

    // Count odd numbers
    public static int getOddCount(int b[]) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Count even numbers
    public static int getEvenCount(int b[]) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        int a[]; // declaration
        a = new int[n]; // instantiation

        // Assigning values in array a 
        for (int i = 0; i < a.length; i++) {
            a[i] = 5 * i;
        }

        // displaying the array a
        ArrayOperations.PrintArray1(a);
        System.out.println();
        int b[] = { 10, 20, 30, 40, 50 };
        ArrayOperations.PrintArray1(b);
        System.out.println();
        System.out.println("Sum of array a elements is: " + ArrayOperations.getSum(a));
        System.out.println();
        System.out.println("Sum of array b elements is: " + ArrayOperations.getSum(b));
        System.out.println();

        b[2] = 999;
        ArrayOperations.PrintArray1(b);
        System.out.println();
        System.out.println("Odd number count: " + ArrayOperations.getOddCount(b));
        System.out.println("Even number count: " + ArrayOperations.getEvenCount(b));
    }
}
