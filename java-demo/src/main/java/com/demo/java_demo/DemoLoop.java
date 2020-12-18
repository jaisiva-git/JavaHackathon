package com.demo.java_demo;

public class DemoLoop {

	public static void main(String[] args) {
			/*1. Write a program to analyse the healthy persons height and weight        
		height is above 3 - 4 : Weight should be 15 - 30 
		height is above 4 - 5 : Weight should be 50 - 60 
		5 - 6 : 60 - 75 
		6 - 8 : 75 - 120 */
		
		int ht = 8;
		//int wt = 60;
		if (ht >=3 && ht<=4) {
			System.out.println("Weight should be 15-30" );
		}
		else if (ht >=4 && ht<=5) {
			System.out.println("Weight should be 50-60" );
		}
		else if (ht >=5 && ht<=6) {
			System.out.println("Weight should be 60-75" );
		}
		else if (ht >=6 && ht<=8) {
				System.out.println("Weight should be 75-120" );
	    }
		else {
			System.out.println("not a healthy persons");
		}
		System.out.println("************************");
		//2. Write an program to print number from 1 - 50 with an increment of 3 digits 1, 4, 7, 10 using while loop and for loop 
		
		for(int i=1; i<=50; i=i+1) {
			System.out.println( i);
		}
		System.out.println("************************");

		for(int j=1; j<=50; j=j+4) {
			System.out.println(j);
		}
		System.out.println("************************");

		for(int k=1; k<=50; k=k+7) {
			System.out.println( k);
		}
		System.out.println("************************");
		
		
		int num = 1;
		int maxnum = 50;
		while(num<maxnum) {
			num ++;
			System.out.println(num);
		}
		System.out.println("************************");

		//3. Write an program to print number from 50 - 1 with an decrement of 5 digits
		
		for(int i=50; i<=1; i--) {
			System.out.println( i);
		}
		for(int i=50; i<=1; i=i-5) {
			System.out.println( i);
		}
		for(int i=50; i<=1; i=i-3) {
			System.out.println( i);
		}
		for(int i=50; i<=1; i=i-4) {
			System.out.println( i);
		}
		for(int i=50; i<=1; i=i-2) {
			System.out.println( i);
		}
	}
	

}
