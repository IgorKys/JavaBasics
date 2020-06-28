package com.syntax.class12;

import javax.swing.text.AttributeSet.ColorAttribute;

public class ArrayRecap {

	public static void main(String[] args) {

		String[] colors = new String[3];

		colors[0] = "blue";
		colors[1] = "yellow";
		colors[2] = "red";

		System.out.println(colors.length);

		for (int b = 0; b < colors.length; b++) {

			String color = colors[b];

			System.out.println(color);
		}
		
		System.out.println("-------------------------");
		
		//advanced loop
		
		for (String color:colors) {
			
			System.out.println(color);
		}

	}

}
