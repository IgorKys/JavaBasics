package com.syntax.class32;

import java.util.LinkedList;
import java.util.List;

public class HW6 {

	// Create a collection of integers in which you can keep duplicates.
	// Write a logic to find sum of all integers

	public static void main(String[] args) {

		List<Integer> integerList = new LinkedList<>();

		integerList.add(10);
		integerList.add(120);
		integerList.add(20);
		integerList.add(32);
		integerList.add(128);
		integerList.add(34);
		integerList.add(56);
		integerList.add(98);

		int sum = 0;

		for (Integer list : integerList) {
			sum += list;

		}
		System.out.println("sum of all integers is "+sum);

	}

}
