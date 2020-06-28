package com.syntax.class13;

public class Car {

	// define car features in a from of variables

	String make;

	String model;

	String color;

	int year;

	int speed;
	
	public static void main(String[] args) {
		
		System.out.println("Hello , I am from main method");
		
		Car c1=new Car();
		
		c1.make = "Toyota";
		c1.model = "Camry";
		c1.color = "Yellow";
		c1.year = 2020;
		c1.speed = 180;
		
		
		// calling method drive
		c1.drive ();
		//// calling method transportPeople 
		c1.transportPeople();
		c1.stop();
		c1.reverse();
		
		
		
	}

	// define behavior in a from methods

	void drive() {

		System.out.println(make + " can drive");

	}

	void reverse() {

		System.out.println(make+  " can reverse");
	}

	void transportPeople() {

		System.out.println(make+ " can transport people");
	}

	void stop() {

		System.out.println(make + " will stop when press break");
		System.out.println(make + " stop");

	}

}
