package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW4 {

	// Create a Map that will store Employee name and salary. Write a logic to
	// retrieve an employee who gets the highest salary. Output should be in the
	// below format
	// John Smith=$100000

	public static void main(String[] args) {

		Map<String, Double> employee = new LinkedHashMap<>();

		employee.put("Donald Duck", 70000.0);
		employee.put("Oliver Kanh", 50000.0);
		employee.put("John Smith", 100000.0);
		employee.put("Lionel Messi", 45000.0);
		employee.put("Andrea Pirlo", 95000.0);

		Set<Entry<String, Double>> employeeSet = employee.entrySet();

		double maxValue = 0;
		String maxKey = "";

		for (Entry<String, Double> empSet : employeeSet) {
			String key = empSet.getKey();
			double value = empSet.getValue();
			if (value > maxValue) {
				maxValue = value;
				maxKey = empSet.getKey();
			}

		}
		System.out.println(maxKey + " = " + maxValue);

	}
}
