package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		// capture the name from the user and print
		// your name is ____
		
		
		// Ask the user to enter the ager and print
		// your name is ___ and age is __ 
		
		
		//1. we bring the Scanner Class to our program
		// 2. System.in --> read from keyboard/console
		Scanner input = new Scanner (System.in);
		
		// we are instructing the user what to enter
		System.out.println("Please enter your full name!");
		//we are capturing the whole line into a text variable
		String name = input.nextLine();
		System.out.println("Your name is " + name);
		
		// we are instructing the user what to enter
		System.out.println("Please enter your age!");
		//we are capturing the text to a double
		double d = input.nextDouble();
		System.out.println("Your name is " + name + " age is " + d);
		
		
		
		
	}

}
