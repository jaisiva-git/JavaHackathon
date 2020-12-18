package com.demo.java_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DemoSwitch {

	public static void main(String[] args) {
		// Switch case
		// Mode of transport
		// 1. by car- 20 mins to reach the destination
		// by train = 40 mins to reach the distination
		// by walk == may or may not to reach the destination

		// by Bus - 50 mins to reach the destination

		Scanner sc = new Scanner(System.in);
		String MOT = "";

		List<String> inputs = new ArrayList<>(); // List all the inputs given
		Map<String, String> map = new HashMap<>();// get all the inputs and values
		Set<String> hs = new HashSet<String>(); 

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the mode of Transport. Enter q to quit");

			MOT = sc.next();

			inputs.add(MOT); // adding inputs using 'add'
			hs.add(MOT);
			System.out.println("You have entered the value = " + MOT);

			String val = "";
			
			if (MOT.equalsIgnoreCase("q")) {// exit the program using q
				System.out.println("I am quitting now");
				System.exit(0);
			}

			switch (MOT.toLowerCase()) {
			case "car":
				val = "It will take 20 mins to reach office";
				break;
			case "train":
				val = "It will take 40 mins to reach office";
				break;
			case "bus":
				val = "It will take 50 mins to reach office";
				break;
			case "walk":
				val = "I am not going to office";
				break;
			default:
				val = "Stay at home";
				System.out.println("Stay at home");
			}

			System.out.println(val);
			map.put(MOT, val);
		}

		System.out.println("All inputs: " + inputs);
		System.out.println("All inputs/Values: " + map);
		System.out.println("Unique:" +hs);
		sc.close();

	}

}
