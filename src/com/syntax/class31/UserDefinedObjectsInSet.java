package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedObjectsInSet {

	public static void main(String[] args) {

		Set<Insurance> lset = new LinkedHashSet<>();
		lset.add(new Pet("Cat", "Cigna"));
		lset.add(new Car("Tesla", "Geico"));
		lset.add(new Health("Blue Cross Blue Shield"));

		for (Insurance ins : lset) {
			System.out.println(ins.insuranceName);
		}

		Iterator<Insurance> it = lset.iterator();

	}

}
