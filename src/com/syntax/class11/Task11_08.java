package com.syntax.class11;

public class Task11_08 {

	public static void main(String[] args) {

		/*
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 */
		System.out.println("1st way");

		String[] countries = {"US", "Brazil", "Ukraine", "China", "Nigeria" };

		int sum = 0;

		for (int i = 0; i < countries.length; i++) {


				System.out.print(countries[i] + ", ");

				sum = countries.length;

			}

		
		System.out.println();

		System.out.println("Total countries are " + sum);

		System.out.println("2nd way");

		int sum2 = 0;
		for (String count : countries) {
			System.out.print(count + " ");
			sum2 = countries.length;
		}
		System.out.println();

		System.out.println("Total countries are " + sum2);
	}

}
