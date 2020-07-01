package com.syntax.class15;

public class HW1234 {

	public static void main(String[] args) {

		// 1.How would you reverse a String character by character?

		System.out.println("---task1");

		String character = "Ukraine";

		for (int i = character.length() - 1; i >= 0; i--) {
			System.out.print(character.charAt(i));
		}

		System.out.println();
		
		

		// 2.How would you reverse a String word by word?
		System.out.println("----------------------------------------");

		System.out.println("---task2---");

		String str = "I love Java";

		String[] split = str.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}

		System.out.println();
		
		

		System.out.println("----------------------------------------");
		
		// 3.How would you check if String is palindrome or not?
		
		System.out.println("---task3---");

		
		
		// 4.How would you swap 2 strings without a temporary variable?
		System.out.println("---task4");

		System.out.println("Before");

		String s1 = "hello";
		System.out.println("s1 = " + s1);
		String s2 = "world";
		System.out.println("s2 = " + s2);

		System.out.println("After");
		s1 = s1 + s2;
		s2 = s1.replaceAll("world", "");
		s1 = s1 + s2;
		s1 = s1.replaceAll("hello", "");

		System.out.println("s2 = " + s2);
		System.out.println("s1 = " + s1);

	}

}
