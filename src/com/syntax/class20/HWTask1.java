package com.syntax.class20;

public class HWTask1 {

	// Write a program that will have 4 different access levels of constructors and
	// create 3 objects of this class: 1 - inside same class; 2 - from outside the
	// class; 3 - from different class inside different package and observe result.

	String name, lastName;
	int age;
	char c;

	// default
	HWTask1() {
		System.out.println(name + " " + lastName);
	}

	// private
	private HWTask1(String name1, String lastName1) {
		name = name1;
		lastName = lastName1;
		System.out.println(name + " " + lastName);
	}

	protected HWTask1(String name1) {

		System.out.println(lastName);
	}
	
	

	public static void main(String[] args) {

		// default
		HWTask1 hw1 = new HWTask1();

		// private
		HWTask1 hw2 = new HWTask1("Igor", "Kysil");

		HWTask1 hw3 = new HWTask1();

	}

}
