package com.syntax.class11;

public class Task11_03 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 */

		int[][] num = { { 2, 3, 5, 10 }, { 21, 36, 1, 54 }, { 11, 25, 33, 22 } };

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				if (num[i][j] % 2 == 0) {

					System.out.print(num[i][j] + " ");
				}
			}
		}

	}
}
