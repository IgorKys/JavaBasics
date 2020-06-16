package com.syntax.class05;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		// Write a program that will read three inputs of scores
		// (quiz, mid term, and final scores)
		// and determine the grade based on the following rules:
		// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your quiz scores");
		int quiz = scan.nextInt();

		System.out.println("Please enter your  mid term scores");
		int midTerm = scan.nextInt();
		
		System.out.println("Please enter your  final scores");
		int finalScores = scan.nextInt();

		int average = (quiz + midTerm + finalScores) / 3;

		if (average >= 90) {
			System.out.println("grade A");
		} else if (average >= 70 && average < 90) {
			System.out.println("grade B");
		} else if (average >= 50 && average < 70) {
			System.out.println("grade C");
		} else if (average < 50) {
			System.out.println("grede F");
		} else {
			System.out.println("You need study more");
		}

	}

}
