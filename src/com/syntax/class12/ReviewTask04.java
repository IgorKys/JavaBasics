package com.syntax.class12;

import java.util.Arrays;

public class ReviewTask04 {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?

		int[] numbers = { 32, 61, 16, 89, 74, 25 };

		int largest = numbers[0];
		int largest2 = numbers[0];

		for (int num : numbers) {

			if (num > largest) {

				largest2 = largest;

				largest = num;

			} else if (num > largest2 && num !=largest) {
				
				largest2 =num;
			}

		}
		
		System.out.println("Largest: " + largest );
		System.out.println("Second largest: " + largest2 );

//		// let's try to find maximum
//		// 1 st way
//
//		int max = numbers[0];
//		int min = numbers[0];
//
//		for (int num : numbers) {
//
//			if (num > max) {
//				// I found a bigger number
//				max = num;
//
//			} else if (num < min) {
//				// I found a smaller number
//				min = num;
//			}
//
//		}
//
//		System.out.println("Maximum is: " + max);
//		System.out.println("Minimum is: " + min);
//
//		// 2 nd way
//
//		System.out.println("---Sorting---");
//
//		Arrays.sort(numbers);
//
////		System.out.println("Maximum is: " + numbers[numbers.length-1]);
////		System.out.println("Second largest: " + numbers[numbers.length-2] );
////		System.out.println("Minimum is: " + numbers[0]);

	}

}
