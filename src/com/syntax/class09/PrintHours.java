package com.syntax.class09;

public class PrintHours {

	public static void main(String[] args) {

		// lets print the clock
		// 00:00
		// 00:01
		// ...
		// 23:59
		// hour goes from 0 to 23
		// minute goes from 0 to 59

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {

				if (m < 10) {

					System.out.println(h + ":0" + m);

				} else {

					System.out.println(h + ":" + m);

				}
				
			}
			
		}

		
		
		
	}

}
