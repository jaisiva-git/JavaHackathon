package com.demo.java_exercise;

public class Java_AreaOfRadius {

	double pi = 3.14;
	double Area;
	double circumference;

	public double Radius(int r) {

		return Area = pi * r * r;

	}
	public double CirRadius(int r) {
		return circumference = 2*pi*r;
	}
	

	public static void main(String[] args) {
		// 10.Take the input of a radius and calculate area + circumference of the
		// circle.
		// Area = pi*r*r circumference = 2*pi*r

		Java_AreaOfRadius Area = new Java_AreaOfRadius();

			System.out.println("Area of Circle:" + Area.Radius(2));
			System.out.println("Area of Circumference:" + Area.CirRadius(4));


	}

}
