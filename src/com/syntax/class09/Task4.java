package com.syntax.class09;

public class Task4 {
	public static void main(String[] args) {

		// Print the following pattern:
		// 55555
		// 4444
		// 333
		// 22
		// 1

		for (int i = 5; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println("----------22222--------------");

		// Print the following pattern:
		// 11111
		// 2222
		// 333
		// 44
		// 5

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j <= 5; j++) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println("-----------3333---------");
		// Print the following pattern:
		//     5
		//    44
		//   333
		//  2222
		// 11111
		
		for (int i  = 1; i<=5 ;i++){
			
			//System.out.print();
			
			for (int j = i;j >=1 ;j--) {
				
				System.out.print(" " + j);
			}
			
			System.out.println();
		}

	}

}
