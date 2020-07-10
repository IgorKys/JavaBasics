package com.syntax.class18;

public class Employee {

	/*
	 * Create a Class called Employee: Create three variables eID , salary and set
	 * the CEO to “Sumair” Create two objects of the class Employee Set the value of
	 * eID, salary for each of the objects Print out the eID , salary and CEO for
	 * each of the objects
	 * 
	 */

	int eID;
	int salary;
	
	static String CEO = "Sumair";

	void v() {
		System.out.println("Employee eID is " + eID + " and salary is " + salary + " and company CEO is " + CEO);
	}

	public static void main(String[] args) {

		Employee obj1 = new Employee();

		obj1.eID = 12345678;
		obj1.salary = 5000;
		obj1.v();

		Employee obj2 = new Employee();

		obj2.eID = 12222222;
		obj2.salary = 7000;
		obj2.v();
		
		//accessing static method
		sayHelloToCeo();;
		

	}
	
	static void sayHelloToCeo() {
		System.out.println("Hi "+CEO);
	}
	

}
