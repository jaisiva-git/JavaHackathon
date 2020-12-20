package com.JavaHackathon;

import java.util.Scanner;

public class Q20 {

		   public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
		    System.out.println("Enter the character:");
		    String str = sc.next();
		      int upperCase = 0;
		      int lowerCase = 0;
		      char[] ch = str.toCharArray();
		      for(char ch1: ch) {
		         if(ch1 >='A' && ch1 <='Z') {
		            upperCase++;
		         } else if (ch1 >= 'a' && ch1<= 'z') {
		            lowerCase++;
		         } else {
		            continue;
		         }
		      }
		      System.out.println(" Uppercase letters:" + upperCase + " Lowercase letters:" + lowerCase);
		   }
		}