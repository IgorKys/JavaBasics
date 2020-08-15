package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW1 {

	// Create a map of Best Buy store. Place
	// item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	//
	// Retrieve all keys and values from a Best Buy map using EntrySet.

	public static void main(String[] args) {

		Map<Integer, String> store = new LinkedHashMap<>();
		store.put(7664847, "Printer");
		store.put(7879885, "TV");
		store.put(7889087, "Laptop");
		store.put(7788843, "Screen");
		store.put(7544332, "Mouse");

		Set<Entry<Integer, String>> storeSet = store.entrySet();

		System.out.println("-----Using foreach loop-----");
		for (Entry<Integer, String> keyAndValue : storeSet) {
			System.out.println(keyAndValue.getKey() + " = " + keyAndValue.getValue());
		}

		System.out.println("-----Using iterator-----");

		Iterator<Entry<Integer, String>> storeIt = storeSet.iterator();
		while (storeIt.hasNext()) {
			Entry<Integer, String> keysAndValues = storeIt.next();
			System.out.println(keysAndValues.getKey() + " = " + keysAndValues.getValue());
		}

	}

}
