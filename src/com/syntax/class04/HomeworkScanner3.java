package com.syntax.class04;

import java.util.Scanner;

public class HomeworkScanner3 {
	public static void main(String[] args) {

		// 3.Create a Java program that will ask user to input city and temperature.
		// Your program should convert Fahrenheit into celsius
		// and print "The temperature in the city __ is __"

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input the city");
		String city = scanner.nextLine();
		
		System.out.println("What is the temparature");
		
		double f = scanner.nextDouble();
		double c = (f - 32) * 5 / 9;

		System.out.println("The temperature in the city " + city + " is " + c);
	}

}
