package com.demo.java_exercise;

public class Java_exercise2 {

	public static void main(String[] args) {
    //2. Write Java program to find factorial of number.  Fact= 1*2*3*4*5*6 = 720
		int fact =1;
		int num = 6;
		
		for (int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial number is" + fact);

	}

}
