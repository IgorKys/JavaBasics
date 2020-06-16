package com.syntax.class02;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		// I love Castro
		String name = "Castro";

		System.out.println("I love " + name);

		System.out.println("I love" + " " + name);

		String statement = "I love";
		
		// I do not want to change my variables
		System.out.println(statement + " " + name);
		
		System.out.println("----");
		
		String car = "BMW";
		int year = 2020;
		
		//concatenation of two Strings
		System.out.println("BMW of year " + "2020" );
		
		//concatenation 
		System.out.println("BMW of year " + 2020);
		
		// concatenation
		System.out.println("BMW of year " + year);
		
		//concatenation 
		System.out.println(car + " of year " + year );

	}

}
