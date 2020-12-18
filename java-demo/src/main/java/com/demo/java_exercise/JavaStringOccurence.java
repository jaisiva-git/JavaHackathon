package com.demo.java_exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaStringOccurence {

	public static void main(String[] args) {
		// 8. WJP to count the occurrence of a given character in string.

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
