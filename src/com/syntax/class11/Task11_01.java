package com.syntax.class11;

public class Task11_01 {

	public static void main(String[] args) {

		// Create a 2D array where you will store
		// the following values: Mr, Mrs, Ms, Miss
		// and Smith, Jordan, Jackson, Obama.
		// After storing values print the following:
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String[][] arr = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jakson", "Obama" } };

		System.out.println(arr[0][1] + " " + arr[1][0]);
		
		System.out.println(arr[0][0] + " " + arr[1][3]);
		
		System.out.println(arr[0][2] + " " + arr[1][2]);
		
		System.out.println(arr[0][3] + " " + arr[1][1]);

		
		
		
	}

}
