package com.JavaHackathon;

public class Q28 {
	public int factNumByRecusrsive(int n) {
		if (n==1) {
			return 1;
		}else {
		return n * factNumByRecusrsive(n - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Q28 d = new Q28();
		 d.factNumByRecusrsive(5);
	}

}
