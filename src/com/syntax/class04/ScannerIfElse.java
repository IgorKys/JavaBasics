package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//ask the user to enter 2 numbers
		//compare the numbers and print which one is large
		
		System.out.println("Please enter a number");
		
		int num1 = scanner.nextInt();
	
		System.out.println("Please enter another number");
		int num2 = scanner.nextInt();
		
		System.out.println("number are " +num1 + " and " + num2);
		
		if (num1>num2) {
			System.out.println(num1 + " is lrger then " + num2);
		}else  if (num1<num2) {
			System.out.println(num1 + " is smaller then " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}

}
