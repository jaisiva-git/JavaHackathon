package com.demo.java_exercise;

public class Java_WhileLoop {

	public static void main(String[] args) {
		//.WJP to calculate the sum of first 10 natural number using while loop 
		
		int num =10;
		int  count=1;
		int total =0;
		while(count <=num) {
			total = total +count;
			count++;
			
		}

		System.out.println("The sum of the first numbers are:"+ total);

	}

}
