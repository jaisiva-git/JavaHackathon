package com.demo.java_demo;

import java.util.Scanner;

public class CalclatorScan {

	public static void main(String[] args) {
		// 7.WJP to Scan and take 2 integers as input. Then perform (+,-,*,/,%)
		// operations on it and print each solutions.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers:");

		int num1 = sc.nextInt();
		//System.out.println( num1);

		int num2 = sc.nextInt();
		//System.out.println( num2);
		
		System.out.println("Result:");

		// perform (+,-,*,/,%)
		int add = num1 + num2;
		System.out.println(" Addition Output :" + add);

		int sub = num1 - num2;
		System.out.println(" Subtraction Output:" + sub);

		int mul = num1 * num2;
		System.out.println(" Multiplication Output:" + mul);

		int div = num1 / num2;
		System.out.println(" Division Output :" + div);

		int mod = num1 % num2;
		System.out.println(" Modulos Output :" + mod);

		sc.close();

	}

}
