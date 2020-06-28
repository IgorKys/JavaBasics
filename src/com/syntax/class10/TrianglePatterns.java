package com.syntax.class10;

public class TrianglePatterns {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ****
		// ***
		// **
		// *
		
		for (int r = 4; r >=1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		//    5
		//   45
		//  345
		// 2345
		//12345
		
		
		for (int i = 5; i >=1;i--) {
			
			for (int j = i+3;j<=5;j--) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}

}
