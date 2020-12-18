package com.demo.java_exercise;

import java.util.Scanner;

public class Java_Swapping {

	public static void main(String[] args) {
		//4. Swap two variable with out using third variable
		
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("Before swapping");  

	  int x=10;
	  int y=20;
		
	  System.out.println("The value is x:" + x);
	  System.out.println("The value is y:" + y);

		//after swapping two variable
	  System.out.println("After swapping");  

		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("The value is x:" + x);
		System.out.println("The value is y:" + y);

		sc.close();
		
		
		
	}

}
