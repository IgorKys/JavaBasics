package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		// Write a program to ask a user to enter item they want to buy and the price of
		// that item . Every time user enters money accumulate the amount and tell the
		// user how much is left to pay off . If user give more money program should
		// return a change . Whenever a user done with payments program should say
		// "Thank you for shopping!"

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter item you want to buy");
		String item = scan.nextLine();

		System.out.println("Please enter price of the item");
		double price = scan.nextDouble();

		System.out.println("Please insert cash  or card and pay");
		double money = scan.nextDouble();

		while (money < price) {
			System.out.println("You need pay more $: " + (price - money));
			System.out.println("Please insert cash  or card and pay");
			
			double addMoney = scan.nextDouble();
			money += addMoney;
		}

		if (money > price ) {
			System.out.println("Your change is " + (money-price));
			System.out.println("Thanks for shopping");
		} else {
			System.out.println("Approved. Thanks for shopping");
		}

	}

}
