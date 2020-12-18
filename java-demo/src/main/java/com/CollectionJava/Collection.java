package com.CollectionJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection {
	
	public static void main(String[] args) {
		List<Integer> ranks = new ArrayList<>();
		ranks.add(100);
		ranks.add(105);
		ranks.add(101);
		ranks.add(110);
		ranks.add(20);
		ranks.add(35);
		ranks.add(1);
		
		System.out.println("input:" + ranks);
		
		Collections.sort(ranks, new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				
				if(arg0 > 99 && arg1 > 99) {
					System.out.println("GT 99: arg0: " + arg0 + "; arg1: " + arg1);
					return arg1 - arg0;
				}
				System.out.println("LT: 100: arg0: " + arg0 + "; arg1: " + arg1);
				return arg0 - arg1;
			}
		});
		
		System.out.println("output:" + ranks);
	}
}
