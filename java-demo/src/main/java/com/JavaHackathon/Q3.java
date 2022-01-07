package com.JavaHackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		int n = sc.nextInt();
		System.out.println("Array of the elements");
		int[] array = new int[10];
		for (int i = 0; i <= n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Sorted Array: " + Arrays.toString(array));
		sc.close();
	}
}
