package com.demo.java_demo;

public class Factorialdemo {
	public int factNumByRecusrsive(int n) {
		if (n==1) {
			return 1;
		}else {
			
		
		return n * factNumByRecusrsive(n - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Factorialdemo d = new Factorialdemo();
		 d.factNumByRecusrsive(5);
		

	}

}
