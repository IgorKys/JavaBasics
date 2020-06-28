package com.syntax.class12;

public class ReviewTask02 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?

		// prime number is greater then 1
		// prime number is only divisible by 1 and itself
		// 1 is not prime
		// 2 (1,2) prime
		// 3 (1,3) prime
		// 4 (1,2,4) not prime
		// 5 (1,5) prime
		// 6 (1,2,3,6) not prime

		int number = 6;

		boolean prime = true;

		if (number > 1) {// I will check
			// try to divide it by 2,3,4,5,6,...293-1
			// if it is divisible by any of these numbers, it is not prime

			for (int i = 2; i < number; i++) {
				if (number % i == 0) { // number is divisible by i
					prime = false;
					break;
				}

			}

		} else {
			prime = false;
		}
		
		System.out.println("The number " + number+ " is prime: " + prime);

	}

}
