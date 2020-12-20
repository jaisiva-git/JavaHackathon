package com.JavaHackathon;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q15 {

	public static void main(String[] args) {

		String str = " Map utility of java";
		String[] strArray = str.split("\\s+");
		Map<String, String> hMap = new LinkedHashMap<String, String>();
		for (int i = 0; i < strArray.length; i++) {
			if (!hMap.containsKey(strArray[i])) {
				hMap.put(strArray[i], "Unique");
			}
		}
		System.out.println(hMap);
	}

}
