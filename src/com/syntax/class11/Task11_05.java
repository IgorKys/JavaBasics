package com.syntax.class11;

public class Task11_05 {

	public static void main(String[] args) {

//		Create a 2D array of integer type with 3 
//		rows and 4 columns and print all values 
//		of the whole array.

		int[][] num = { { 2, 4, 6, 8 }, { 1, 10, 14, 24 }, { 10, 45, 78, 100 } };

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				System.out.print(num[i][j] + " ");
			}
		}

	}

}
