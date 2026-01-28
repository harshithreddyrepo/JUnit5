package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

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
	void testComputeCircleArea() {
		int actualResult=shapes.computeCircleArea(5);
		int expectedResult=75;
		assertEquals(expectedResult, actualResult, "Circle area calculation is wrong");
	}

}
