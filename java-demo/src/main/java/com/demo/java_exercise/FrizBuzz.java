package com.demo.java_exercise;

public class FrizBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println("frizz");
			}
			if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			System.out.println(i);
		}

	}

}
