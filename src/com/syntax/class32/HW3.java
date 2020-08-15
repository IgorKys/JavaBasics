package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW3 {

	// Create a Map from array of cities that will sort keys in alphabetical order.
	// As a key store the name of the city and as a value store the length of the
	// city (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
	// If any city name is more than 7 characters remove that city .

	public static void main(String[] args) {

		Map<String, Integer> cities = new TreeMap<>();

		cities.put("Paris", 5);
		cities.put("Moscow", 6);
		cities.put("Washington DC", 13);
		cities.put("San Francisco", 12);
		cities.put("Rome", 4);
		cities.put("Lviv", 4);
		cities.put("Renton", 5);

		Set<String> citiesSet = cities.keySet();

		Iterator<String> citiesIt = citiesSet.iterator();
		while (citiesIt.hasNext()) {
			String city = citiesIt.next();
			if (city.length() >= 7) {
				citiesIt.remove();
			}

		}
		System.out.println("Cities that have less the 7 characters " + citiesSet);
		System.out.println("Map  " + cities);
	}

}
