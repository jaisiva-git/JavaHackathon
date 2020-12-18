package com.demo.java_exercise;

public class FibonacciSeries {
	
	public static int fib(int n) {
	//// Fibonacci = 0+1+1+2+3+5 The Fibonacci numbers are the numbers in the following integer sequence.
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..  Fn = Fn-1 + Fn-2
		int fib = 0;
	for(int i=0;i<=fib; i++)
	{
		if (n<=1) // if n value is 0 return 0 
		{
			return n;
		}
		else {
			return fib(n-1) +fib(n-2);
		}
	}
	return fib;
	}
	

	public static void main(String[] args) {
		
		System.out.println("The fibonoci series :"+ fib(15));

	}

}
