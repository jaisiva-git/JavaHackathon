package com.demo.java_demo;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 64, 25, 12, 22, 11 };

		System.out.println("Bubble sorting elements:" + Arrays.toString(a));// it returns string of the array
		for (int i = 0; i < a.length; i++) { // Number of iterations

			for (int j = i + 1; j < a.length; j++)// compare the each elements
			{
				if (a[i] > a[j]) {
					int c = a[i];// swapping the numbers
					a[i] = a[j];
					a[j] = c;
				}

			}

		}
		// for (int i = 0; i < a.length; i++) {
		System.out.println("After sorting the elements:" + Arrays.toString(a));

	}
}
