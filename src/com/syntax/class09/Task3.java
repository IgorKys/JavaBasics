package com.syntax.class09;

public class Task3 {

	public static void main(String[] args) {

		// Print the following pattern
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int i = 5; i >=1;i--) {
			
			for (int j =i; j <=5; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
