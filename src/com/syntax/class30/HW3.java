package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3 {

	// Create a class Insurance that will have an attribute as insuranceName and
	// unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
	// Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
	// has petType attribute. Create 3 objects of the sub classes and store them in
	// ArrayList. Using for loop/advanced for loop/ iterator access all methods of
	// the class.

	public static void main(String[] args) {

		ArrayList<Insurance> insurance = new ArrayList<>();
		insurance.add(new Car("Geico", "Nissan"));
		insurance.add(new Pet("Farmers", "dog"));
		insurance.add(new Health("State Farm"));

		System.out.println("---FOR LOOP---");
		for (int i = 0; i < insurance.size(); i++) {
			insurance.get(i).getQuote();
			insurance.get(i).cancelInsurance();
			System.out.println("------------------------------------------");
		}

		System.out.println("---ENHANCED LOOP---");
		for (Insurance insur : insurance) {
			insur.getQuote();
			insur.cancelInsurance();
			System.out.println("------------------------------------------");
		}

		System.out.println("---ITERATOR---");
		Iterator<Insurance> insuranceIterator = insurance.iterator();
		while (insuranceIterator.hasNext()) {
			Insurance in = insuranceIterator.next();
			in.getQuote();
			in.cancelInsurance();
			System.out.println("------------------------------------------");
		}

	}

}

abstract class Insurance {

	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println("Get quote for " + carModel + " in " + insuranceName);
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel insurance for " + carModel + " in " + insuranceName);
	}

}

class Pet extends Insurance {

	String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println("Get quote for " + petType + " in " + insuranceName);
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel insurance for " + petType + " in " + insuranceName);
	}

}

class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Get insurance for health in " + insuranceName);
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel insurance for health in " + insuranceName);
	}

}
