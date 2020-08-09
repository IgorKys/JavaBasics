package com.syntax.class31;

import java.util.HashSet;
import java.util.Set;

public class Task3 {

	// Create a Set collection that will hold Objects of Student Type. In this set
	// we do not care about the insertion order. Each student object should have
	// name and studentID. Display name of each student.

	public static void main(String[] args) {

		Set<Student> studentType = new HashSet<>();

		studentType.add(new Student1("Donald", "0001"));
		studentType.add(new Student2("John", "0002"));
		studentType.add(new Student3("Oliver", "0003"));

		for (Student stu : studentType) {
			String name = stu.name;
			System.out.println(name);
		}

	}

}

abstract class Student {

	String name, studentID;

	Student(String name, String studentID) {
		this.name = name;
		this.studentID = studentID;
	}

}

class Student1 extends Student {

	public Student1(String name, String studentID) {
		super(name, studentID);

	}

}

class Student2 extends Student {

	public Student2(String name, String studentID) {
		super(name, studentID);

	}

}

class Student3 extends Student {

	public Student3(String name, String studentID) {
		super(name, studentID);

	}

}
