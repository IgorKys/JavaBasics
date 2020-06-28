package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * 
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 * 
		 * 
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 * 
		 * 
		 * You have a String a=“Is it saturday? Is it raining? Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 * 
		 * 
		 */
		
		System.out.println("---Task1---");
		
		String sentence = "I am good in Java";
		
		sentence=sentence.replaceAll(" ", "");
		System.out.println(sentence);
		
		System.out.println("---Task2---");
		
		String letters = "I am good in Java 1234567 *^%^&";
		letters = letters.replaceAll("[^A-Za-z]", "");
		
		
		System.out.println(letters.length());
		
		System.out.println("---Task3---");
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] sentences = a.split("[?]");
		int num = sentences.length;
		System.out.println(num);
		
	}

}
