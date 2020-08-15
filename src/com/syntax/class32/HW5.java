package com.syntax.class32;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW5 {

	// Create the collection that will store single uniques Objects of a String type
	// in which order is preserved.
	// Write a logic to concatenate all string from the collection.

	public static void main(String[] args) {

		Set<String> cities = new LinkedHashSet<>();

		cities.add("Rome");
		cities.add("Renton");
		cities.add("Kyiv");
		cities.add("Barcelona");
		cities.add("Pris");

		String total = "";
		for (String city : cities) {
			total += city + " ";

		}
		System.out.print(total);

	}

}
