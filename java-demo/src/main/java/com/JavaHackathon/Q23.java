package com.JavaHackathon;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		//Q23. WJP to differentiate input as string, int or bool
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		
		String str = sc.next().trim();
		
		if(str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
			System.out.println("input is boolean: " + str);
		}
		
		try {
			Integer.parseInt(str);
			System.out.println("input is integer: " + str);
		}catch(Exception e) {
			System.out.println("input is String: " + str);
		}
		
		sc.close();
		
	}

}
