package com.syntax.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double result;
		System.out.println("Please enter the first number:");
		double num1 = scan.nextDouble();

		System.out.println("Please enter the number:");
		double num2 = scan.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
		char operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			System.out.println("Invalid operator");
		}
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			System.out.println("The result is: " + result);
		}
	}

}
