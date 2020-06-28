package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		// Print the following pattern:
		// 54321
		// 54321
		// 54321
		// 54321

		for (int i = 4; i >= 1; i--) {

			for (int j = 5; j >= 1; j--) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

}
