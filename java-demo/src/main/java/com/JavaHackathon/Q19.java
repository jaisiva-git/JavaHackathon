package com.JavaHackathon;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q19 {

	public static void main(String[] args) {

		String str = "JavaLanguage";
		// create an hashmap
		Map<Character, Integer> chCountMap = new LinkedHashMap<Character, Integer>();
		// convert into string into character
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			Integer v = chCountMap.get(c);
			if (v == null) {
				v = Integer.valueOf(0);
				chCountMap.put(c, v);
			}
			v++;
			chCountMap.put(c, v);
		}
		System.out.println(chCountMap);
	}
}
