package com.demo.java_demo;

public class DemoComparator {

	public static void main(String[] args) {
		//5. use if else conditions for isMarried variables. Age as adult or not
		// Declare boolean and int variables
		boolean isMarried = true;
		int age =35;
		// First name and last name
		String Fname = "Jayasri";
		String Lname = "Kasinathan";
		System.out.println("Name: " + Fname  + " " + Lname);
		// comparator "=="
		if (isMarried == true) {
			String Md = "Married";
			System.out.println( "Status : " + Md);
			
		}
			else {
				String Nd = "Not Married";
				System.out.println("Status :"+ Nd);
			}
		// Comparator ">"
		if (age >18) {
			System.out.println("I am an adult");
			
		}else {
			System.out.println("I am nor an adult");
			
		}
		// comparator <
		if (age <35) {
			System.out.println("Age is incorrect");
		}else
			System.out.println("Age is correct");
		
		//comparator >=
		if (age >=35) {
			System.out.println("Age is correct");
		}else
			System.out.println("Age is incorrect");
		
		
		
		
	}

}
