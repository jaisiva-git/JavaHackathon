package com.demo.java_demo;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.WJP to make a calculator using switch case in Java(Include all arithmetic
		// operators +,-,* and /).

		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arthimetric operators:");

		String ariOper = sc.next();
		System.out.println("Enter the num1=");

		// initialise the variables
		num1 = sc.nextDouble();

		System.out.println("Enter the num2=");

		num2 = sc.nextDouble();

		// switch case - addition,Subtraction,multiply, division


		double val;
		switch (ariOper.toLowerCase()) {

		case "+":
			val = num1 + num2;
			System.out.println(val );
			break;
		case "-":
			val = num1 - num2;
			System.out.println(val );
			break;
		case "*":
			val = num1 * num2;
			System.out.println(val);
			break;
		case "/":
			val = num1 / num2;
			System.out.println(val);
			break;
		default:
			System.out.printf("You have entered wrong operator");
			//return;

		}
		sc.close();

	}

}
