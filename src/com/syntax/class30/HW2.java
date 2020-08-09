package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {

	// Create an arrayList of even numbers from 1 to 50. Remove any number that is
	// divisible by 5 from that arrayList.

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				numbers.add(i);
			}
		}

		Iterator<Integer> numbersIterator = numbers.iterator();

		while (numbersIterator.hasNext()) {
			int num = numbersIterator.next();
			if (num % 5 == 0) {
				numbersIterator.remove();
			}
		}
		System.out.println(numbers);

		System.out.println("---------2nd way-----------");

		ArrayList<Integer> numbers1 = new ArrayList<>();
		for (int i = 2; i <= 50; i += 2) {
			numbers1.add(i);
		}
		Iterator<Integer> number = numbers1.iterator();
		while (number.hasNext()) {
			if (number.next() % 5 == 0) {
				number.remove();
			}
		}
		System.out.println(numbers1);

	}

}
