package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {

		String[][] food = { { "borch", "varenyky" }, { "burgers", "fries", "pizza" } };

		for (int i = 0; i < food.length; i++) {

			for (int j = 0; j < food[i].length; j++) {

				System.out.print(food[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("----------");

		for (String[] eat : food) {

			for (String eat1 : eat) {

				System.out.print(eat1 + " ");
			}

			System.out.println();
		}

		System.out.println("--------task 2-----------");

		// calculate sum and all odd numbers

		int[][] numbers = { { 10, 23, 56, 47 }, { 33, 668, 89 }, { 1, 9, 0 } };

		// regular for loop

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {

				if (numbers[i][j] % 2 != 0) {

					sum += numbers[i][j];

				}
			}
		}
		System.out.print(sum + " ");
	}

}
