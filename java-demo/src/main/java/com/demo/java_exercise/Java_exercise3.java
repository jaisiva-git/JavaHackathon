package com.demo.java_exercise;

import java.util.Scanner;

public class Java_exercise3 {

	public static void main(String[] args) {
		//3. Write Java program to find first big, second big and third biggest number ( Take user input, use
		//scanner function)
		// 1 to 10 --> big number
		// 11 to 20 --->second big
		// 21 to 30 -->biggest  number
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the biggest number : " );
		System.out.print("Input the 1st number: ");
		  int num1 = sc.nextInt();
		   
		  System.out.print("Input the 2nd number: ");
		  int num2 = sc.nextInt();
		   
		  System.out.print("Input the 3rd number: ");
		  int num3 = sc.nextInt();
		   
		  //find First big  and second big number 
		  if (num1 > num2 && num1 > num3)
		  
		    System.out.println("The biggest: " + num1);
		   else  {
			   System.out.println("Second big"+ num1);

			   
		  }
		   
		  if (num2 > num1  && num2 > num3)
		   
		    System.out.println("The biggest: " + num2);
		   else {
			   System.out.println("Second big"+ num2);

		   }
		   
		  if (num3 > num1 && num3 > num2)
		   
		    System.out.println("The biggest: " + num3);
		   else {
			   System.out.println("Second big"+ num3);

		   }
		  //to find the third big number
		  
		  if (num1 < num2 && num1 < num3)
			  
			    System.out.println("The third big: " + num1);
			   else  {
				  
				   
			  }
			   
			  if (num2 < num1  && num2 < num3)
			   
			    System.out.println("The third big: " + num2);
			   else {
				   
			   }
			   
			  if (num3 < num1 && num3 < num2)
			   
			    System.out.println("The third big: " + num3);
			   else {
			
		  sc.close();
		  
		 }
		}
}

