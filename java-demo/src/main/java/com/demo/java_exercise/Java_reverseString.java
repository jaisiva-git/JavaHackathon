package com.demo.java_exercise;

public class Java_reverseString {

	public static void main(String[] args) {
		//6. Reverse string with out using reverse command
		String str = "Java";
		String rev = " ";
		System.out.println("Input :" + str);

		
		int len =str.length();
		
		for (int i=len-1; i>=0; i--) {
			rev =rev +str.charAt(i);
			
		}
		System.out.println("Output :" + rev);
	}

}
