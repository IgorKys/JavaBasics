package com.syntax.class04;

import java.util.Scanner;

public class HomeworkScanner1 {
	public static void main(String[] args) {
		// 1.You are a loan specialist and you need to ask user what is the amount of
		// loan
		// is needed.
		// If loan is less or equal to 200,000 then you would lend the money
		// otherwise you would reject the client.

		Scanner scanner = new Scanner(System.in);

		System.out.println("what is the amount of loan is needed");
		int i = 200000;
		int loan = scanner.nextInt();

		if (loan >= i) {
			System.out.println("you would lend the money");
		} else {
			System.out.println("you would reject the client");
		}

	}

}
