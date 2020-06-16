package com.syntax.class02;

public class HomeWork2 {
	public static void main(String[] args) {

		// 1. Write a Java program to add, subtract, multiply and divide 2 decimal
		// values.
		// Your program should say.
		// "The _______ of 2 numbers ___ and ___ is equal to _____"

		// decimal values
		double d1 = 3.5;
		double d2 = 4.2;

		//
		double add = d1 + d2;
		double sub = d1 - d2;
		double mult = d1 * d2;
		double div = d1 / d2;

		String s1 = "addition";
		String s2 = "subtraction";
		String s3 = "multiplication ";
		String s4 = "division ";

		System.out.println('"' + "The " + s1 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + add + '"');
		System.out.println('"' + "The " + s2 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + sub + '"');
		System.out.println('"' + "The " + s3 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + mult + '"');
		System.out.println('"' + "The " + s4 + " of 2 numbers " + d1 + " and " + d2 + " is equal to " + div + '"');

		System.out.println("-------------------------------");

		// 2. Write a program to find the square of the number 3.9.
		// You program should say "The square of the ____ is ____ "

		double d3 = 3.9;
		double mult2 = d3 * d3;

		System.out.println('"' + "The square of the number " + d3 + " is " + mult2 + '"');

		System.out.println("-------------------------------");

		// 3.Write a program to print the area and perimeter of a rectangle with width =
		// 5 and height = 8.
		// Your program should say.
		// "The perimeter of a rectangle with width ___ and height ____ is equal to
		// _____ and the area is __"

		int w1 = 5;
		int h1 = 8;

		int a1 = w1 * h1;
		int p1 = w1 + h1 + w1 + h1;

		System.out.println('"' + "The perimeter of a rectangle with width " + w1 + " and height " + h1 + " is equal to "
				+ p1 + " and the area is " + a1 + '"');

	}

}
