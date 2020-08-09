package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	// Create an arrayList of words. Remove every word that ends with “e”.

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();

		words.add("cake");
		words.add("spell");
		words.add("syntax");
		words.add("list");

		System.out.println(words.size());

		Iterator<String> wordsIt = words.iterator();

		while (wordsIt.hasNext()) {
			String word = wordsIt.next();
			if (word.endsWith("e")) {
				wordsIt.remove();
			}
		}

		System.out.println(words);

	}

}
