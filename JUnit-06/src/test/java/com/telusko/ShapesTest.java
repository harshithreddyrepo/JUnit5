package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shapes=new Shapes();

	@Test
	void testComputeSquareArea() {
		int actualResult=shapes.computeSquareArea(24);
		int expectedResult=576;
		assertEquals(expectedResult, actualResult); // Test case will fail if expected and actual result "NOT MATCHES".
		// It tries to compare the value of the arguments passed.
		// It doesn't works as expected if the arguments are reference type.
		// It works well for primitive types. 
	}
	
	@Test
	void testComputeCircleArea() {
		int actualResult=shapes.computeCircleArea(5);
		int expectedResult=75;
		assertEquals(expectedResult, actualResult, "Circle area calculation is wrong");
	}
	
	@Test
	void testComputeCircleArea_Supplier() {
		int actualResult=shapes.computeCircleArea(5);
		int expectedResult=75;
		assertEquals(expectedResult, actualResult, ()->"Circle area calculation is wrong"); // Supplier will be evaluated only if the test fails (LAZY EVALUATION).
	}
	
	@Test
	void testComputeSquareArea_Not() {
		int actualResult=shapes.computeSquareArea(24);
		int expectedResult=566;
		assertNotEquals(expectedResult, actualResult); // Test case will fail if expected and actual result "MATCHES".
	}
	
	@Test
	void testTrue() {
		boolean condi=true;
		assertTrue(condi); // Test case will fail if the condition is evaluated as "False". 
	}
	
	@Test
	void testFalse() {
		boolean condi=false;
		assertFalse(condi); // Test case will fail if the condition is evaluated as "True". 
	}
	
	@Test
	void testArrays() {
		int[] expectedArr= {1,2,3,4};
		int[] actualArr= {1,2,3,4};
		assertArrayEquals(expectedArr, actualArr); // Test case will fail if the values in the array NOT MATCHES.
	}

}
