package com.demo.java_demo;

public class DemoClass {

	public static void main(String[] args) {
       
		//3. create SYSO statement to print atleast 20 line of anything about yourself --> no copy paste 
		// First name and last name
				String Fname = "Jayasri";
				String Lname = "Kasinathan";
				System.out.println("Name: " + Fname  + " " + Lname);
		// Qualification
				
				System.out.println("My qualification is Bachleor of engineering.");
		// Work experience
				System.out.print(" I have experience in manual testing.");
		// Place to live
				System.out.print(" I lives in foster city, California. ");
		//Work authorization
				System.out.println(" I have h4 ead.");
				
				System.out.println("*************************");
				
		//4. instead of hardcoding all names, age, address, phone etc.. use variables 
		
		// Age
		
		int age = 35;
		System.out.println("Age:" + age);
		
		// Email
		String Email = "jayasriak2@gmail.com";
		System.out.println("Eamil:" + Email);
		
		// Place
		
		String city = "Foster city";
		System.out.println("City:  " + city);
		
		// Height
		float ht = 5.2f;
		System.out.println("Height:" + ht);
		
		// Zip code
		int zip = 94404;
		System.out.println("Zipcode:" + zip);
		
		// phone Number
		
		long ph = 7048197376L;
		System.out.println("Phone Number :" + ph);
		 //weight
		
		double wt = 60.2;
		System.out.println("weight:" + wt);
		
		boolean married = true;
		System.out.println("Married :" + married);
		
		
	}

}
