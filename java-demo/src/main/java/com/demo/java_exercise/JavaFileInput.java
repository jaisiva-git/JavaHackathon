package com.demo.java_exercise;

import java.io.File;
import java.io.IOException;

public class JavaFileInput {
	
	public void creatFi () throws IOException {
		
		File f = new File("/Users/Sasha/Jai/Java.txt");
		boolean createFile = f.createNewFile();
		if (createFile) {
			System.out.println("File is Successfuly created");
		}else
		{
			System.out.println("file is not successfully created");
		}
		
	}
		
	

	
	public static void main(String[] args) throws IOException {
			//"/Users/Sasha/Jai/Java.txt");
		JavaFileInput obj = new JavaFileInput();
		obj.creatFi();
		
}
	}

	