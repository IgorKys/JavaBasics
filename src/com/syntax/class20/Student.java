package com.syntax.class20;

public class Student {

	/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name.
	 * 
	 */
	
	String name;
	int mathGrade, scienceGrade ,historyGarade;
	
	Student(String studentName, int studentmathsGrade, int studentScienceGrade, int studentHistoryGrade){
		name = studentName;
		mathGrade = studentmathsGrade;
		scienceGrade = studentScienceGrade;
		historyGarade = studentHistoryGrade;
	}
	
	int calculateAvarageGrade() {
		int avarage= (mathGrade+scienceGrade+historyGarade)/3;
		return avarage;
	} 
	

}
