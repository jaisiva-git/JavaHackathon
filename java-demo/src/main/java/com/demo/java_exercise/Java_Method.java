package com.demo.java_exercise;

import java.util.Scanner;

public class Java_Method {
	
	public int getMyNumber(int num1, int num2) {
		 if(num1 == num2) {
			 return 0;
		 }
		 
		if (num1 % 6 == num2 % 6){
		
			if(num1 > num2) {
				return num2;
			}else {
				return num1;
				
			}
		}
		
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
		
	public static void main(String[] args) {
		//3. WJP that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value 
		//if the two values have the same remainder when divided by 6.
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
		int num1 =sc.nextInt();
		System.out.println(num1);
        
		System.out.println("Enter the num2");
		int  num2 =sc.nextInt();
		System.out.println(num2);


		Java_Method jm = new Java_Method();
		int result = jm.getMyNumber(num1, num2);
		System.out.println("your result is:"+ result);
			
	
	
sc.close();
	
		
	
	}

}
