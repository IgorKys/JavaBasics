package com.syntax.class11;

public class Task11_06 {

	public static void main(String[] args) {

		/*
		 * Create an array of cars : american, german, korean, italian. Then retrieve
		 * all values from that array using 2 different loops
		 */

		System.out.println("1st way");

		String[] cars = { "Tesla", "Audi", "Hyundai", "Lamborghini" };

		for (int i = 0; i < cars.length; i++) {

			System.out.print(cars[i] + " ");
		}

		System.out.println("\n2nd way");

		for (String car : cars) {

			System.out.print(car + " ");
		}

	}

}
