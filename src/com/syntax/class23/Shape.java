package com.syntax.class23;

public class Shape {

	double radius;

	public Shape(double radius) {
		this.radius = radius;
	}

}

class Circle extends Shape {

	public Circle(double radius) {
		super(radius);

	}

	public double area() {

		return 3.14 * (radius * radius);
	}

}
