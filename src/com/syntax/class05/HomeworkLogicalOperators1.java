package com.syntax.class05;

import java.util.Scanner;

public class HomeworkLogicalOperators1 {

	public static void main(String[] args) {
		
		//Write a program to find largest of three double values 
		//using if else..if 
		//and logical operators provided by a 
		//user (numbers must be distinct)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the larges number");
		
		double d1 = scan.nextDouble();
		double num1 = d1;
		
		double d2 = scan.nextDouble();
		double num2 = d2;
		
		double d3 = scan.nextDouble();
		double num3 = d3;
		
		if ((num1 > num2) && (num1>num3)) {
			System.out.println("The largest number is " + num1);
		} else if ((num2>num1) && (num2>num3)) {
			System.out.println("The largest number is " + num2);
		}  else if ((num3>num1) && (num3>num2)) {
		System.out.println("The largest number is " + num3);
		} else {
			System.out.println("it is not the largest number");
		}
		
	}

}
