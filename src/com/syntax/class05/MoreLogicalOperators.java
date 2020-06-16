package com.syntax.class05;

import javax.sound.midi.Soundbank;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		
		//we have 7 days of weeks
		//if day is 2 or 4 --> SDLS
		//if day is 6or7 --> Java class
		// if day is 1 or 5 --> NO class
		//if day is 3 --> Review class
		
//		int day = 5;
//		
//		//To compare the equality of two numbers we use -->  == 
//		
//		if (day == 2 || day == 4 ) {
//			System.out.println("SDLS class");
//		}else if (day == 6 || day ==7) {
//			System.out.println("Java class");
//		}else if (day ==1 || day ==5 ) {
//			System.out.println("NO class");
//		}else if (day == 3) {
//			System.out.println("Review Class");
//		}else {
//			System.out.println("wrong day");
//		}
		
		System.out.println("------------Using String_______");
		// To compare the equality of two Strings we use --> .equals 
		
		String day2 = "Tuesday";
		
		if (day2.contentEquals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLS class");
		} else if (day2.contentEquals("Saturday") || day2.equals("Sunday")) {
			System.out.println("Java class");
		}else {
			System.out.println("no class");
		}

	}

}
