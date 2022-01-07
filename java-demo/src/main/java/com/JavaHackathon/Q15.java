package com.JavaHackathon;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q15 {
	public static void printUniqueWords(String str) {
		String[] strArray = str.split("\\W");
		Map<String, Integer> hMap = new LinkedHashMap<String, Integer>();
		for (String str1: strArray ) {
			if (hMap.containsKey(str1)) {
				hMap.put(str1, hMap.get(str1)+1);
			}else
				hMap.put(str1, 1);
		}
		for (Map.Entry<String, Integer> entry :
            hMap.entrySet()) {
           if (entry.getValue() == 1)
               System.out.println(entry.getKey());
       }
	}
		
	public static void main(String[] args) {

		String str = " Welcome to java and java programming";
		printUniqueWords(str);
		
}
}
