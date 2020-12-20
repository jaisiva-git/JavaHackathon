package com.JavaHackathon;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
	//  find duplicate character in a string. 
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		//String str = "Software QA Engineer";
		char cArray[] = str.toLowerCase().toCharArray();
		System.out.println("The duplicate strings input is: " + str);
		System.out.print("output: ");
		
		for(int i=0; i<cArray.length; i++) {
			for(int j=i+1; j<cArray.length; j++)
			{
				if (cArray[i] ==cArray[j]) {
					System.out.print( cArray[j] + " , ");
                     break;
				}

			}
		}
	}
	
	
}
