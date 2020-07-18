package com.syntax.class23;

public class CalculateArea {

	// 3. Create 1 class in which create a methods that will calculate the area
	// (volume) of
	// Rectangle
	// Square
	// Box

	public static void main(String[] args) {

		Area rectangle = new Area();

		System.out.println("Rectangle area = " + rectangle.area(15, 5));

		Area square = new Area();

		System.out.println("Square area = " + square.area(12));

		Area box = new Area();

		System.out.println("Box area = " + box.area(12, 10, 4));

	}

}
