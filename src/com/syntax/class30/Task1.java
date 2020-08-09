package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	// Create an arraylist of cars and retrieve all the values using 3 different
	// ways.

	

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();

		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Toyota");
		cars.add("Nissan");

		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i) + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		Iterator<String> carIt = cars.iterator();

		while (carIt.hasNext()) {
			String str = carIt.next();
			System.out.print(str+" ");
		}

	}

}
