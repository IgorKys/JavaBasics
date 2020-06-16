package com.syntax.class04;

import java.util.Scanner;

public class HomeworkScanner4 {
	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		// If you user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately
		// otherwise you can tell them that they can spend more.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Has user a credit card?");

		boolean cc = scanner.nextBoolean();

		if (cc) {
			System.out.println("What is the balance");

			double balance = scanner.nextDouble();

			if (balance > 1000) {
				System.out.println("pay off immediately");
			} else {
				System.out.println("you can spend more");
			}

		} else {
			System.out.println("We can offer you a credit card");
		}

	}

}
