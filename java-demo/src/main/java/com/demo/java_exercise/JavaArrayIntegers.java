package com.demo.java_exercise;

public class JavaArrayIntegers {
   static  int  arr[]= {1,2,3,4,5};

	public static int sumArray() {
		int sum =0;
       //int  arr[]= {1,2,3,4,5};

		for(int i=0;i< arr.length; i++) {
			sum = sum + arr[i];
			//return sum;
		}
		return sum; 
	}
	public static boolean booArray() {
		int myNum = 3;
		for(int i=0; i<arr.length; i++) {
			
		
		 if(arr[i]== myNum) {
			 return true;
			 
		 }else
			 return false;
		}
		return true;
	}

	public static void main(String[] args) {
        System.out.println("Sum of given array is " + sumArray()); 

		System.out.println("Array:"+ booArray());
		
	}

}
