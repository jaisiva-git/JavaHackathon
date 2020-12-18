package com.demo.java_demo;

import java.util.Scanner;

public class CompareNum {

	public static void main(String[] args) {
         //8. Program to compare two numbers.
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter  two numbers");
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 +"is greater");
		}else if (num1<num2) {
			System.out.println(num1 +"is smaller");

		}else if (num1==num2) {
			System.out.println(num1 +"is equal");

		}
		
		sc.close();
		
	}

}
