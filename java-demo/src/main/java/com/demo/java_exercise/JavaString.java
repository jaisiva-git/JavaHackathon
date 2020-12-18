package com.demo.java_exercise;

public class JavaString {

	public static void main(String[] args) {
		// 7. WJP to check if a string contains only digits.

		String str = "123";
			if (str.matches("[0-9]+") && str.length()>2){
				System.out.println("String contains only digits");
				
			}else {
				System.out.println("String contain digits and also characters");
			}
				
		}

	}


