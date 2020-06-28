package com.syntax.class13;

public class Phone {
	
	//define state/attributes
	
	String model; 
	
	String color;
	
	int year;
	
	int memory;
	
	// define behavior in a from methods
	
	void faceId() {
		
		System.out.println("I can unlock my " + model + " whith face Id");
	}
	
	void call () {
		
		System.out.println("I can call to everyone");
	}
	
	void picture () {
		
		System.out.println("I can make a picture");
	}
	
	

}
