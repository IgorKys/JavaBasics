package com.syntax.class20;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Smith", 70, 80, 83);
		System.out.println("Average grade of 1 student is " + student1.calculateAvarageGrade());

		Student student2 = new Student("Adam", 49, 23, 94);
		int grade2 = student2.calculateAvarageGrade();
		System.out.println("Average grade of 2 student is " + grade2);

		Student student3 = new Student("Lucy", 98, 53, 45);
		System.out.println("Average grade of 3 student is " + student3.calculateAvarageGrade());

		Student student4 = new Student("Mary", 78, 15, 0);
		System.out.println("Average grade of 4 student is " + student4.calculateAvarageGrade());

		Student student5 = new Student("Ahmet", 67, 89, 99);
		System.out.println("Average grade of 5 student is " + student5.calculateAvarageGrade());

	}

}
