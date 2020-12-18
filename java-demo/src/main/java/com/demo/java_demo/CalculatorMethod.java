package com.demo.java_demo;

public class CalculatorMethod {

	public void add(int x, int y) {

		int tot = x + y;
		System.out.println("Addition:" + tot);
	}

	public void add(int x, int y, int z) {
		int tot = x + y + z;
		System.out.println("Addition:" + tot);
	}

	public void sub(int x, int y) {
		int tot = x - y;
		System.out.println("Subtraction:" + tot);
	}

	public void mul(int x, int y) {
		int tot = x * y;
		System.out.println("Multiple:" + tot);
	}

	public void mul(int x, int y, int z) {
		int tot = x * y * z;
		System.out.println("Multiple:" + tot);
	}

	public void div(int x, int y) {
		int tot = x / y;
		System.out.println("Division:" + tot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the arthimetric operators:");
		CalculatorMethod cm = new CalculatorMethod();
		cm.add(5, 6);
		cm.add(5, 6, 4);
		cm.sub(5, 6);
		cm.mul(5, 6);
		cm.mul(5, 6, 4);
		cm.div(5, 6);

	}

}
