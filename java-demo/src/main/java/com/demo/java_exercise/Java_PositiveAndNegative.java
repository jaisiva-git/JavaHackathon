package com.demo.java_exercise;

import java.util.Scanner;

public class Java_PositiveAndNegative {

	public static void main(String[] args) {
		// WJP to check if Number is Positive or Negative using If loop.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 3; i++) {

		System.out.println("Enter the numbers:");
		int num = sc.nextInt();
			if (num >= 0) {

				System.out.println("This number is Positive");
			} else
				System.out.println("This is number is negative");

		}

		sc.close();
	}

}
