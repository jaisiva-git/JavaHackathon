package com.JavaHackathon;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine(); // original string
		System.out.println("Input:" + str);

		String[] words = str.split(" ");// Splitting the string into words

		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			String s = words[i];
			sb.append(s).append(" ");
		}
		System.out.println("Output:" + sb);
		sc.close();
	}

}
