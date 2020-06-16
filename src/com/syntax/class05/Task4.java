package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		// Write a program for user to enter his/hers birth month.
		// Based on the month define the season.
		// Example: if user is born in June, July or August → season ="Summer".
		// At the end of the program we should see output as "You were born ______".

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = scan.nextLine();

		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("It is winter");
			System.out.println("You were born in winter");
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("It is spring");
			System.out.println("You were born in spring");
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("It is summer");
			System.out.println("You were born in summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("It is fall");
			System.out.println("You were born in fall");
		} else {
			System.out.println("Incorect month");
		}

	}

}
