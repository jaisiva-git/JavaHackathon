package com.JavaHackathon;

public class Q13 {

	public static void main(String[] args) {
		
		String str = " Java code"; //original string
		System.out.println("Input:"+ str);

        String[]   words = str.split(" ");//Splitting the string into words
        
        StringBuilder sb = new StringBuilder();
      
        
        for(int i = words.length - 1; i >= 0; i--) { 
        	String s = words[i];
        	sb.append(s).append(" ");
        }
       
		System.out.println("Output:"+ sb);
	}

}
