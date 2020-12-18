package com.demo.java_exercise;

public class Java_Concatenation {

	public static String removeFirstCharacter(String str) {
		  
		  //use the substring() method of String class to remove first character of a string.
		   str= str.substring(1,str.length());
		    return str;
		   
	}

	public static void main(String[] args) {
		//4. WJP to create the concatenation of the two strings except removing the first character of each stringTest 
		//Data: Str1 = PythonStr2 = TutorialSample Output: ythonutorial
		  String str1= "Python";
		  String str2= "Tutorial";


		System.out.print(removeFirstCharacter(str1)+removeFirstCharacter(str2));
	

	

}
}
