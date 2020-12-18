package com.demo.java_exercise;

import java.util.Scanner;

public class Java_StringLowercase {

	public static void main(String[] args) {
		// 2. WJP to convert a given string into lowercase.

		Scanner sc = new Scanner(System.in);
		System.out.println("Convert the String:");
		String ch = sc.next().toUpperCase();

		System.out.println(ch);

		String s = "";
		
			s = s + ch.toLowerCase();
		
			System.out.println("input: " + ch + "; output: " + s);

		
		sc.close();

	}

}
