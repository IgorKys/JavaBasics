package com.syntax.class12;

public class REcaap {

	public static void main(String[] args) {

		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		int sum1 = 0;
//		int sum2 = 0;
//		int sum3 = 0;
//		int sum4 = 0;
		

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length-1; j++) {

				sum1 += a[0][j];

			}
		}

		System.out.println(sum1);

	}
}
