package com.CollectionJava;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	// 1.Write a Java program to create a new array list, add some colors (string)
	// and print out the collection.
	public static void arrstr(ArrayList<String> aS) {

		System.out.print("Colors: ");
		// for(String Arr : aS) {
		System.out.println(aS);

	}

	// 2. Write a Java program to iterate through all elements in a array list.
	public static void arrElements(ArrayList<Integer> Ele) {
		System.out.println("Interate all elements:");

		for (int i : Ele) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// 1.Write a Java program to create a new array list, add some colors (string)
		// and print out the collection.
		ArrayList<String> AS = new ArrayList<String>();// creating an array

		AS.add("Pink");// add some colors
		AS.add("Rose");
		AS.add("Red");
		AS.add("Yelloow");
		//insert the elments in the list
		AS.add(0, "Red");
		AS.add(5,"Blue");
		//Retrieve an element in the list
		String Retrieve =AS.get(4);
		System.out.println("Retrieve the ELements:"+ Retrieve);
		//Update an elements
		AS.set(4, "Yellow");
		//Sort the elements
		Collections.sort(AS);
		arrstr(AS);
		
		// 2. Write a Java program to iterate through all elements in a array list.

		ArrayList<Integer> el = new ArrayList<Integer> ();
		el.add(10);
		el.add(20);
		el.add(30);
		arrElements(el);
		
	}

}
