package com.JavaHackathon;

import java.util.HashMap;
import java.util.Map;

public class Q5 {
	public static void findDuplicates(int[] input) {
		Map<Integer, Integer> hp = new HashMap<>();
		// k, v

		//arr = {1,1,4,2,3,1,4,5,10}
		for (int i : input) {
			Integer count = hp.get(i);
			//System.out.println("Map: " + hp);
			if (count == null) {
				 count = Integer.valueOf(1);
				 hp.put(i, count);
				// System.out.println( hp.get(i));
				 continue;
			}
			count++;
			hp.put(i, count);
			//System.out.println( hp.get(i));
		}
		for (int k : hp.keySet()) {
			if(hp.get(k) == 1 ) {
				System.out.println("this number is unique: " + k);
				continue;
			}
			System.out.println("this number is NOT unique: " + k + "; occurences: " + hp.get(k));
		}
	}
	public static void main(String[] args) {
		// Given an array prints the unique numbers and also print the number of
		// occurrences of duplicate numbers.
		Q5 AN = new Q5();
		int [] a = new int[] {1,1,1,1,1,2,2,3,4,5,2,2};
		 AN.findDuplicates(a);
	}

}
