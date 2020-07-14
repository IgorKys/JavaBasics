package com.syntax.class20;

public class Task {

	String name;
	String lastName;
	int age;

	Task(String Taskname, String TasklastName, int Taskage) {
		name = Taskname;
		lastName = TasklastName;
		age = Taskage;
	}

	Task() {
		System.out.println("I am an non argument constructor");
	}

	void displayFacts() {
		System.out.println("This is " + name + " " + lastName + ", " + age);
	}

	public static void main(String[] args) {

		Task t = new Task("Vika", "Chaney", 25);
		t.displayFacts();

		Task t1 = new Task();

	}
}
