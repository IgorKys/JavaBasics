package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies --> You are healthy
		// otherwise:
		// if peanut allergy: Dont eat peanut
		// Lactose allergy: Dont eat milk
		// bee allergy: Dont mess with bees
		// seefood allergy: Dont eat fish

		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = false;

		if (!allergies) {
			// no allergy
			System.out.println("You are health");
		} else {
			// we have to check which allergy
			if (peanut) {
				System.out.println("Don't eat peanut");
				if (lactose) {
					System.out.println("Don't drink milk");
				}
				if (bee) {
					System.out.println("Dont mess with bee");
				}
				if (seafood) {
					System.out.println("Dont eat fish");
				}
			}

		}
	}
}
