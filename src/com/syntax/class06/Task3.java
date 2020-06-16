package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Using scanner class create calculator
		// Allow user to enter 2 numbers and operator(+,-,*,/)
		// Based on operator provide the result to user.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");
		int num1 = scan.nextInt();

		System.out.println("Please enter operator:(+,-,*,/)");
		String operator = scan.next();

		System.out.println("Please enter second number");
		int num2 = scan.nextInt();

		int result;

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			result = 0;
		}

		System.out.println("The result is:" + num1 + operator + num2 + "=" + result);
	}

}
