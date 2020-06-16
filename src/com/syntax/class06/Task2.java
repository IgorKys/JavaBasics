package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age");

		String grade = scan.nextLine();
		String explanation;

		switch (grade) {
		case "A":
			explanation = "Exellent";
			break;
		case "B":
			explanation = "Good";
			break;
		case "C":
			explanation = "Average";
			break;
		case "D":
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
			break;
		}
			System.out.println(grade + " was entered by a user with explanation: " + explanation);
	}

}
