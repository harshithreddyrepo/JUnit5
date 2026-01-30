package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shapes=new Shapes();

	@Test
	void testComputeSquareArea() {
		int actualResult=shapes.computeSquareArea(24);
		int expectedResult=576;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@DisplayName(value = "Testing Area of Circle Method")
	void testComputeCircleArea() {
		int actualResult=shapes.computeCircleArea(5);
		int expectedResult=75;
		assertEquals(expectedResult, actualResult, "Circle area calculation is wrong");
	}
	
	@Disabled
	void testComputeRectangeArea() {
		int actualResult=shapes.computeRectangleArea(4, 3);
		int expectedResult=12;
		assertEquals(expectedResult, actualResult);
	}
}
