package com.JavaHackathon;

public class Q1 {

	public static boolean checkBoolean(boolean a, boolean b, boolean c) {

		int i = 0;
		if (a) {
			i++;
		}
		
		if (b) {
			i++;
		}
		
		if (c) {
			i++;
		}
		
		return i >= 2;

	}
	public static void main(String[] args) {
		// Consider there is a 3 Boolean variable called a, b, c. Check if at least two
		// out of three Booleans are true
		
		boolean r = checkBoolean(true, false, false);
		System.out.println("r = " + r);
		
		 r = checkBoolean(true, true, true);
		System.out.println("r = " + r);
		
		 r = checkBoolean(true, true, true);
		System.out.println("r = " + r);
		
		 r = checkBoolean(false, false, false);
		System.out.println("r = " + r);

	}

}
