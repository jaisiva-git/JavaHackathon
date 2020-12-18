package com.demo.java_exercise;

public class JavaDuplicate {

	public static void main(String[] args) {
	// WJP to find duplicate character in a string. 
		
		String str = "Software QA Engineer";
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
