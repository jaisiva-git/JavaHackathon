package com.demo.java_exercise;

public class Java_EndsWith {
	
	private String suffix = null;
	private boolean ignoreCase = false;
		
	public Java_EndsWith(String suffix) {
		this.suffix = suffix;
	}
	
	public Java_EndsWith(String suffx, boolean ignoreCase) {
		this.suffix = suffx;
		this.ignoreCase = ignoreCase;
	}
	
	public boolean findMyString(String strInput) {
		if(strInput.endsWith(suffix) ) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		//5.  WJP to check whether a given string ends with the contents of another string.test data"Python Exercises" ends with "se"? false   "Python Exercise" ends with "se"? true

		String str = "Python Exercise";
		Java_EndsWith je1 = new Java_EndsWith("se");
		boolean result = je1.findMyString("Python Exercise");
		System.out.println("result: " + result);
		
		Java_EndsWith je2 = new Java_EndsWith("ing");
		boolean result1 = je2.findMyString("Python Exercises");
		System.out.println("result: " + result1);
		
    
     System.out.println();

	}

}
