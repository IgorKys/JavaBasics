package com.syntax.class04;

public class MoreNEstedIf {
	public static void main(String[] args) {
		// Lets have a date of month and the day of week
		// if its Friday--> We are going to watch a movie
		// 						if date is 13 --> Watch a scary movie
		// 						if date is not 13 --> Watch a comedy
		// if its not Friday --> We are goig to study JAVA

		boolean isFriday = false;
		int date = 13;

		if (isFriday) {
			System.out.println("We are going to watch a movie");
			if (date == 13) {
				System.out.println("Watch a scary movie");
			} else {
				System.out.println("Watch a comedy");
			}
		} else {
			System.out.println("We are going to study JAVA");
		}

	}
}