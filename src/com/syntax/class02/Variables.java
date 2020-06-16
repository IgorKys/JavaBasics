package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Ihor";
		String lastName = "Kysil";
		String grade = "A-";
		String city = "Renton";
		String state = "WA";
		int phoneNumber1 = 425306914;
		String phoneNumber2 = "1235678901";

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber1);
		System.out.println(phoneNumber2);
		
		System.out.println("------");

		// b
		// String city2 = "Garfield";
		// not good because you are not re-assing

		city = "Chicago";
		state = "IL";
		phoneNumber1 = 306475600;
		phoneNumber2 = "938474733";
		grade = "B+";

		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber1);
		System.out.println(phoneNumber2);
		System.out.println(grade);
		
		System.out.println("---------------");
		System.out.println("My name is " + name + " and my last name is " + lastName + '.');
		
		System.out.println("I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber2 + '!');

	}

}
