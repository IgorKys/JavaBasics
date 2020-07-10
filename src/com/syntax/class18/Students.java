package com.syntax.class18;

public class Students {

//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students

	String studentName;
	int studentID;
	static int numberOfStudents;

	static void total() {
		System.out.println("Total number of students: " + numberOfStudents);
	}

	public static void main(String[] args) {

		Students student1 = new Students();
		student1.studentName = "Igor";
		student1.studentID = 12345;
		Students.numberOfStudents++;

		Students student2 = new Students();
		student2.studentName = "Igor";
		student2.studentID = 12345;
		Students.numberOfStudents++;

		Students student3 = new Students();
		student3.studentName = "Igor";
		student3.studentID = 12345;
		Students.numberOfStudents++;

		Students.total();

	}

}
