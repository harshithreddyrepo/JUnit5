package com.telusko;

public class Shapes {

	public int computeSquareArea(int side) {
		int area=side*side;
		return area;
	}
	
	public int computeCircleArea(int radius) {
		int area=(int)3.14*radius*radius;
		return area;
	}
	
	public int computeRectangleArea(int l, int b) {
		return 0;
	}
}
