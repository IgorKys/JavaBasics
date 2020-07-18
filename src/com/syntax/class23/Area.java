package com.syntax.class23;

public class Area {
	// 3. Create 1 class in which create a methods that will calculate the area
	// (volume) of
	// Rectangle
	// Square
	// Box
	
	public int area(int length , int width) {
		return length*width;
	}
	
	public int area(int side ) {
		return side*side;
	}
	
	public int area(int length,int width,int heigth) {
		
		int area = 2*(heigth*width+width*length+heigth*length);
		return area;
	}

}
