package com.syntax.class04;

import java.util.Scanner;

public class HomeworkScanner2 {
	public static void main(String[] args) {

		// 2. You are DMV representative and you need to ask customer their age.
		// If they are 18 and older you will issue a driver license to them,
		// otherwise you will offer them to get a learners permit.

		Scanner scanner = new Scanner(System.in);
		int years = 18;
		System.out.println("What is your age?");
		int age = scanner.nextInt();

		if (age >= years) {
			System.out.println("you will get a driver license");
		} else {
			System.out.println("you need to study more");
		}

	}
}
