package com.syntax.class08;

public class Homework {

	public static void main(String[] args) {

		// Print numbers from 100 to 1

		for (int i = 100; i >= 1; i--) {

			System.out.println(i);
		}
		System.out.println("---Print numbers 1,2,3,---");

		// Print numbers 1,2,3,

		for (int i = 1; i <= 3; i++) {
			System.out.print(i + ",");
		}

		System.out.println("--- Print odd numbers between 20 and 50 (1st way)---");

		for (int i = 20; i <= 50; i++) {

			if (i % 2 == 1) { // Its an odd number
				System.out.println(i);
			}
		}

		System.out.println("--- Print odd numbers between 20 and 50 (2 way)---");

		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i);
		}

		System.out.println("---Print numbers between 5 and 1---");

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("---What is the result---");

		int total = 1;
		for (int k = 1; k <= 4; k++) {
			total = total + k;
		}
		System.out.println(total);

	}

}
