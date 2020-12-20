package com.JavaHackathon;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.demo.java_exercise.JavaFileInput;

public class Q31 {


		//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
		public void creatFi () throws IOException {
			
			File f = new File("/Users/sasha/Jai/git/java-demo/src/main/java/com/JavaHackathon/Test.txt");
			List<String> lines=  Files.readAllLines(f.toPath());
			
			List<String> lines2 = new ArrayList<>();
			
			for(int i=lines.size()-1; i>=0; i--) {
				
				String s = lines.get(i);
				System.out.println(s);
				lines2.add(s);
			}
			
			File f2 = new File("/Users/sasha/Jai/git/java-demo/src/main/java/com/JavaHackathon/Testout.txt");
			Files.write(f2.toPath(), lines2);
			
		}
		public static void main(String[] args) throws IOException {
				//"/Users/Sasha/Jai/Java.txt");
			Q31 obj = new Q31();
			obj.creatFi();

	}

}
