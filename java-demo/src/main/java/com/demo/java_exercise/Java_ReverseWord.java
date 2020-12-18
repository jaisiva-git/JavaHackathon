package com.demo.java_exercise;

public class Java_ReverseWord {

	public static void main(String[] args) {
			//7. Reverse word in a string ( Example: I/p  →  “ I am good boy” o/p  → ”I ma doog yob”
		
		String str = " Java is a programming language"; //original string
		
        String[]   Words = str.split(" ");//Splitting the string into words
        
        String revString = " ";
        
        for(String w: Words) { 
        	
        	String reverseWords = " ";
        	
        	for(int i= w.length()-1; i>=0;i--) {
        		
        		reverseWords = reverseWords + w.charAt(i);
        		
        	}
       revString = revString +reverseWords + " ";
        }
       
		System.out.println(revString);
	}

}
