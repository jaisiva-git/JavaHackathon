package com.demo.java_demo;

public class DemoString {

	public static void main(String[] args) {
	//Reverse the string with inbuilt function
			String str = "Jayasri";
		
			StringBuilder reverse = new StringBuilder(str).reverse();
		
			System.out.println(reverse);

		
	// Reverse the string without inbuilt function
			String str1 = "Reverse me";
		
			System.out.println("******************" );

		for(int i=str1.length()-1;i>=0;i--) {
			
		    System.out.print(str1.charAt(i)); 

	 //	Reverse the string
			System.out.print("******************" );

			String str2 ="Reverse";
			StringBuilder input = new StringBuilder(str2);
        
		// append a string into StringBuilder input

			input.append(str2).reverse();
		

			System.out.println(input);

		}
}
}