package com.syntax.class12;

public class ReviewTask01 {

	public static void main(String[] args) {

		// Write a program to swap 2 numbers without a temporary variable?

		int a = 20;
		int b = 30;
		
		a = a+b; // a= 50
		b = a - b; // b = 50-30 = 20
		a = a-b;//a = 50-20=30
		
		
		System.out.println( a);
		System.out.println(b);
		

	}

}
