package com.JavaHackathon;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner  sc  = new  Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine(); //original string
		System.out.println("Input:"+str);
		String rev = " ";
		
		int len = str.length();
		for(int i = len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Output:"+ rev);
		sc.close();
	}

}
