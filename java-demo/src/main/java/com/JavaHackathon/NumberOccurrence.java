package com.JavaHackathon;

import java.util.Scanner;

public class NumberOccurrence {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Numbers:");

		int Num = Sc.nextInt();
		int a[] = new int[Num];
		int count = 1;
		for (int i = 0; i < Num; i++) {
			a[i] = Num;
			}
			for (int j = 0; j < Num; j++) {
				if (a[j] == Num) {

					count++;
				}
			
			System.out.println(count);

			Sc.close();
		}

	}

}
