package com.syntax.class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	// Create a Set collection in which you need to add names of the countries. In
	// this set we want all objects to be sorted in alphabetical order. Using 2
	// different ways retrieve all elements from set.

	public static void main(String[] args) {

		Set<String> countries = new TreeSet<>();
		countries.add("Ukraine");
		countries.add("USA");
		countries.add("Italy");
		countries.add("Spain");

		System.out.println("-----Using for each loop-----");
		for (String country : countries) {
			System.out.print(country + " ");
		}
		
		

		System.out.println("\n-----Using iterator-----");

		Iterator<String> countriesIt = countries.iterator();
		while (countriesIt.hasNext()) {
			String country = countriesIt.next();
			System.out.print(country + " ");
		}

	}

}
