package com.demo.java_exercise;

import java.util.Scanner;

public class Java_Palindrome {

	public static void main(String[] args) {
		// palindrome

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Palindrome Name:");
		String inputs = sc.nextLine();

		String s = "";
		for (int i = inputs.length() - 1; i >= 0; i--) {
			s = s + inputs.toLowerCase().charAt(i);

		}

		System.out.println("input: " + inputs + "; output: " + s);

		if (inputs.equalsIgnoreCase(s)) {
			System.out.println("It is palindrome");

		} else {
			System.out.println("It is not palindrome");
		}
		sc.close();
	}
}
