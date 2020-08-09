package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	// Create a Set of cities in which you want to make sure that insertion order is
	// maintained. Using Iterator remove any city that starts with “A”;

	public static void main(String[] args) {

		Set<String> cities = new LinkedHashSet<>();
		cities.add("Lviv");
		cities.add("Kyiv");
		cities.add("Renton");
		cities.add("Rome");
		cities.add("Aarhus");

		Iterator<String> citiesIt = cities.iterator();
		while (citiesIt.hasNext()) {
			String city = citiesIt.next();
			if (city.startsWith("A")) {
				citiesIt.remove();
				System.out.print(cities + " ");
			}

		}

	}

}
