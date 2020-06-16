package com.syntax.class05;

public class HomeworkLogicalOperator2 {

	public static void main(String[] args) {

		// Write a program to find largest number among three numbers
		// using nested if provided by a user
		// (numbers must be distinct)

		int num1 = 55;
		int num2 = 50;
		int num3 = 70;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("The largest number is " + num1);
			} else {
				System.out.println("The largest number is " + num3);
			}
		} else if (num2 > num3) {
			System.out.println("The largest number is " + num2);
		} else {
			System.out.println("The largest number is " + num3);
		}
	}
}