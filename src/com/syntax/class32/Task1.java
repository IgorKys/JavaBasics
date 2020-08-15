package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {

	// Create a map of countries with its capital that will store countries in
	// alphabetical order.
	// Print all keys and values from a country map using for each loop and
	// iterator.
	// Print all values from a country map using for each loop and iterator.

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();

		map.put("Ukraine", "Kyiv");
		map.put("Italy", "Rome");
		map.put("France", "Paris");
		map.put("Spain", "Madrid");
		map.put("USA", "DC");

		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println("Country is " + key + " and the capital is " + map.get(key));
		}

		System.out.println("-------------------------------------");
		Iterator<String> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			String key = keysIt.next();
			System.out.println("Country is " + key + " and the capital is " + map.get(key));
		}

		System.out.println("-------------------------------------");
		Collection<String> values = map.values();

		for (String value : values) {
			System.out.println("The capital is " + value);
		}

		System.out.println("-------------------------------------");
		Iterator<String> valueIt = values.iterator();
		while (valueIt.hasNext()) {
			String value = valueIt.next();
			System.out.println("The capital is " + value);
		}

	}

}
