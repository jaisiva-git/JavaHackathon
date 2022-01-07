package com.JavaHackathon;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		//find the total number of integers,uppercase, and lowercase characters in the given string
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		int upper=0; int lower=0; int number=0; int special=0;
		
		for(int i=0;i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch >= 'A'  && ch<='Z') {
				upper++;
			}
			else if(ch >= 'a'  && ch<='z') {
				lower++;
			}
			else if(ch >= '0'  && ch<='9') {
				number++;
			}
			else
				special++;
		}
		
		System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);	
        sc.close();
	}

}
