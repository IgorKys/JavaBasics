package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW2 {

	// Create a Person class with following private fields: name, lastName, age,
	// salary.
	// Variables should be initialized through constructor.
	// Inside the class also create a method to print user details.
	// In Test Class create a Map that will store key in ascending order. In that
	// map store personId and a Person Object. Print each object details.

	public static void main(String[] args) {

		Map<Integer, Person> treeMap = new TreeMap<>();

		treeMap.put(334, new Person("John", "Snow", 26, 100000));
		treeMap.put(247, new Person("Lionel", "Messi", 34, 200000));
		treeMap.put(421, new Person("Donald", "Duck", 54, 50000));
		treeMap.put(111, new Person("Francesco", "Totti", 42, 500000));
		treeMap.put(567, new Person("Joe", "Smith", 43, 40000));

		System.out.println(" 1.----Using EntrySet ---");

		Set<Entry<Integer, Person>> persons = treeMap.entrySet();

		System.out.println("----FOREACH LOOP---");

		for (Entry<Integer, Person> person : persons) {
			Person value = person.getValue();
			value.details();
		}

		System.out.println("----ITERATOR---");

		Iterator<Entry<Integer, Person>> personsIt = persons.iterator();

		while (personsIt.hasNext()) {
			Entry<Integer, Person> person = personsIt.next();
			Person value = person.getValue();
			value.details();

		}

		System.out.println("2.----Using values()---");

		Collection<Person> personValues = treeMap.values();

		System.out.println("----FOREACH LOOP---");
		for (Person person : personValues) {
			person.details();
		}

		System.out.println("----ITERATOR---");
		Iterator<Person> personValuesIt = personValues.iterator();
		while (personValuesIt.hasNext()) {
			Person value = personValuesIt.next();
			value.details();
		}

		System.out.println("3.----Using keySet()---");

		Set<Integer> treeSet = treeMap.keySet();

		System.out.println("----FOREACH LOOP---");
		for (Integer key : treeSet) {
			Person value = treeMap.get(key);
			value.details();
		}
		System.out.println("----ITERATOR---");

		Iterator<Integer> treeIterator = treeSet.iterator();
		while (treeIterator.hasNext()) {
			Integer key = treeIterator.next();
			Person value = treeMap.get(key);
			value.details();
		}

	}

}

class Person {

	private String name, lastName;
	private int age, salary;

	public Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public void details() {
		System.out.println(name + " " + lastName + " is " + age + " years old and his salary is " + salary + " $");
	}

}
