package com.syntax.class11;

public class Task11_04 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers.
		 */

		int[][] num = { { 12, 24, 36 }, { 11, 3, 67 }, { 10, 20, 30 } };
		
		
		int length = num.length;
				System.out.println(length);
				
		int sum = 0;
		for (int i = 0; i<num.length;i++) {
			
			for (int j = 0; j<num[i].length;j++) {
				
				sum +=num[i][j];
				
			}
		}

		System.out.print("The sum of all numbers: "+ sum);

	}

}
