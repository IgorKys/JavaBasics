package com.syntax.class04;

import java.util.Scanner;

public class HomeworkScanner5 {
	public static void main(String[] args) {

		// Write a program to ask user to enter numbers of worked years and annual
		// salary.
		// If user worked for more or equals to 5 years than user is eligible for the
		// bonus, otherwise he is not.
		// Once user is eligible and salary is larger than 50000 than bonus = 5000,
		// otherwise bonus=3000.

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter numbers of worked years");
		int years = scanner.nextInt();

		if (years >= 5) {
			System.out.println("user is eligible for the bonus");
			
			System.out.println("what is your salary");
			int salary = scanner.nextInt();
			
			if (salary > 50000) {
				System.out.println("bonus is 5000");
			} else {
				System.out.println("bonus is 3000");
			}

		} else {
			System.out.println("He is not eligible");
		}

	}

}
