package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured
		// print which language user speaks.
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your country:");
		String country = scan.nextLine();

		String language;

		switch (country) {
		case "Ukraine":
			language = "ukranian";
			break;
		case "Germany":
			language = "german";
			break;
		case "France":
			language = "franch";
			break;
		case "Italy":
			language = "italian";
			break;
		case "USA":
		case "England":
			language = "english";
			break;
		default:
			language = "Unknown";
			break;

		}
		System.out.println("You speak " + language);

	}

}
