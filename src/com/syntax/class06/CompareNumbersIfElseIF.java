package com.syntax.class06;

public class CompareNumbersIfElseIF {

	public static void main(String[] args) {

		// first way
		double a = 5, b = 9, c = 1;
		double largest;

		if (a > b && a > c) {
			largest = a;
		} else if (b > a && b > c) {
			largest = a;
		} else if (c > a && c > b) {
			largest = a;
		} else {
			largest = 0;
		}
		
		System.out.println("The largest number is " + largest);
		
		
		// second way
		if (a > b && a > c) {
			largest = a;
		} else if (b>c) {
			largest = b;
		} else {
			largest = c;
		}
		

	}

}
