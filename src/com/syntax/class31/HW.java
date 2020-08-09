package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {
	// Create a map of a building. Store floor number and it is associated company
	// name.
	// (Example: 1= Google, 2=Syntax etc..).
	// Insert 7 entries with duplicate keys and values.
	// Check how many entries you have?
	// Update company on a 4th floor
	// Remove company on the 7th floor
	// Print your map

	public static void main(String[] args) {

		Map<Integer, String> building = new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Microsoft");
		building.put(4, "Amazon");
		building.put(5, "Facebook");
		building.put(6, "Instagram");
		building.put(4, "TikTok");
		building.put(7, "Instagram");

		System.out.println("Size " + building.size());
		System.out.println("Before update " + building);

		building.replace(4, "Apple");
		System.out.println("After update " + building);

		building.remove(7);
		System.out.println("After removing " + building);

		Set<Integer> buildingKeys = building.keySet();

		Iterator<Integer> buildingIt = buildingKeys.iterator();
		while (buildingIt.hasNext()) {
			Integer bld = buildingIt.next();
			System.out.println(bld + " floor: " + building.get(bld));
		}

		System.out.println("---------------------");

		for (Integer key : buildingKeys) {
			System.out.println(key + " + value: " + building.get(key));
		}

	}

}
