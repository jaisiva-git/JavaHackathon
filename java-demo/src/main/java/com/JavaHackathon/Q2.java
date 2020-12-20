package com.JavaHackathon;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial:");
		long Fact = sc.nextInt();
		long fact = 1 ;
		//long n = 0;
		for(int i=1; i<=Fact; i++) {
			fact=fact * i;
			sc.close();
		}
		System.out.println("Output:" +fact);
	}
}

