package com.syntax.class14;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		// Create a String and print it in reverse order (Sunday → yadnuS).

		String day = "Sunday";

		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}

		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.

		System.out.println();

		String name = "IhorKysil";

		if (!name.isEmpty()) {

			int length = name.length();

			if (length % 2 != 0 && length >= 3) {

				int middle = length / 2;

				System.out.println(name.charAt(middle));
			}
		}

//		Write a program that reads two people's first
//		names and if they expecting boy or girl? 
//				Based on the input suggests a name for a baby:
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? boy
//				Suggested baby name: DANRY
//
//				Example Output:
//				Mosm’s first name? Mary
//				Dad’ first name? Daniel
//				Boy or Girl? girl
//				Suggested baby name: MAIEL

		Scanner scan = new Scanner(System.in);

		System.out.println("Mosm’s first name?");
		String nameMom = scan.next();

		System.out.println("Dad’s first name?");
		String nameDad = scan.next();

		System.out.println("What is the gender of the baby");
		String nameBaby = scan.next();

		if (nameBaby.equals("boy")) {
			nameMom = nameMom.substring(nameMom.length()/2);
			nameDad = nameDad.substring(0, nameDad.length()/2);
			nameBaby = nameDad.concat(nameMom);
		} else {
			nameMom = nameMom.substring(0, nameMom.length()/2);
			nameDad = nameDad.substring(nameDad.length()/2);
			nameBaby = nameMom.concat(nameDad);

		}
		System.out.println("Suggested baby name:" + nameBaby.toUpperCase());

	}

}
