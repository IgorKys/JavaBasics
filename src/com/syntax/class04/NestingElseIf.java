package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		// if student completed the quiz we will check the score
		// if score > 90 --> Great job!
		// if score > 80 --> Well done!
		// if score > 70 --> Just passed!
		// otherwise --> You failed!
		//
		// if student didn't complete the quiz, Please finish your quiz!

		boolean completed = false;
		int score = 24;

		if (completed) {
			// lets check the score
			if (score >= 90) {
				System.out.println("Great job!");
			} else if (score >= 80) {
				System.out.println("Well done!");
			} else if (score >= 70) {
				System.out.println("Just passed!");
			} else {
				System.out.println("You failed!");
			}
		} else {
			System.out.println("Please finish your quiz!");
		}

	}
}