package com.JavaHackathon;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Character:");
		String str=sc.next();
		int inum = 100;
		int inum2 = Integer.parseInt(str);
			
		int sum = inum+inum2;
		System.out.println("Result is: "+sum);
		sc.close();
	   }

 

	}


