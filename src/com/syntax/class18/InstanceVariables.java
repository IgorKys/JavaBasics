package com.syntax.class18;

public class InstanceVariables {
	
	String name = "Yuriy"; // instance variable
	
	public static void main(String[] args) {
		
		String name = "Kristina"; // local variable
		System.out.println(name); // Kristina
		
		// we create an Object or instanciate a class or create an instance of the class
		InstanceVariables obj = new InstanceVariables();
		obj.name = "Jane";
		System.out.println(obj.name); // Jane
		
		// would like to change value from Kristina to Castro
		name = "Castro";
		System.out.println("New value of the local variable "+ name);
		
		// would like to change value from Jane to Ed --> changing value of the instance variable
		obj.name = "Ed";
		System.out.println("New value of instance variable " +  obj.name);
		
		System.out.println("Printing value of name using 2 instance");
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		
		
	}

}
