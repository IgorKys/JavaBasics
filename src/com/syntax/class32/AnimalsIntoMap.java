
package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {

	public static void main(String[] args) {

		Map<Integer, Animal> life = new LinkedHashMap<>();
		life.put(1, new Dog("Dog", "Grey"));
		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "Black and White"));

		System.out.println(" 1.       ----          Using EntrySet         ---              ");
		Set<Entry<Integer, Animal>> entries = life.entrySet();

		System.out
				.println("     ----        Access all variables and call all available methods of Animals      ---   ");
		for (Entry<Integer, Animal> e : entries) {
			Animal animal = e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

		System.out.println("        ----           Iterator         ---              ");
		// write with Iterator

		Iterator<Entry<Integer, Animal>> enriesIt = entries.iterator();
		while (enriesIt.hasNext()) {
			Entry<Integer, Animal> entry = enriesIt.next();
			Animal animal = entry.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

		System.out.println("2.        ----          Using values()        ---              ");

		Collection<Animal> values = life.values();
		for (Animal animal : values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

		// write with Iterator
		System.out.println("        ----           Iterator         ---              ");

		Iterator<Animal> valuesIt = values.iterator();
		while (valuesIt.hasNext()) {
			Animal animal = valuesIt.next();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

		System.out.println("3.        ----          Using keySet()        ---              ");

		Set<Integer> keys = life.keySet();

		for (int key : keys) {
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

		// write with Iterator
		System.out.println("        ----           Iterator         ---              ");

		Iterator<Integer> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			Integer key = keysIt.next();
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

	}
}
