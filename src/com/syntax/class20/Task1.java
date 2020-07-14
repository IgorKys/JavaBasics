package com.syntax.class20;

public class Task1 {

	// Write a program that will have a constructor: one with parameters and second
	// without any parameters. Create a separate Test class where you will execute
	// both of the constructors 1 by 1.

	
	Task1() {
		System.out.println("I am 1 st constructor");
	}

	Task1( String obj1Name) {
	System.out.println("I am 2 nd constructor " + obj1Name);
	}

}
