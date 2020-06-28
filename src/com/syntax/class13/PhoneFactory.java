package com.syntax.class13;

public class PhoneFactory {
	
	public static void main(String[] args) {
		
		//building an object
		
		System.out.println("===iPhone===");
		
		Phone iPhone = new Phone();
		
		iPhone.model = "11PRO";
		iPhone.color = "Red";
		iPhone.year = 2019;
		iPhone.memory = 256;
		
		System.out.println("Iphone "+ iPhone.model + iPhone.color+" has the " + iPhone.memory + "gb");
		
		System.out.println("===Sumsung===");
		
		Phone Sumsung = new Phone();
		
		Sumsung.model = "Galaxy S20";
		Sumsung.color = "Black";
		Sumsung.year = 2020;
		Sumsung.memory = 128;
		
		System.out.println("Sumsung "+ Sumsung.model + Sumsung.color+" has the " + Sumsung.memory + "gb");
		
		Phone Nokia = new Phone();
		
		Nokia.model = "2 V";
		Nokia.color = "White";
		Nokia.year = 2018;
		Nokia.memory = 64;
		
		System.out.println("Nokia "+ Nokia.model + Nokia.color+" has the " + Nokia.memory + "gb");
				
		
		
		
	}

}
