package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTest {

	Shapes shape;
	
	ShapesTest(){
		System.out.println("Test object is created to invoke unit test");
	}
	
	@BeforeAll
	static void beforeAllTest() {
		System.out.println("Before All Tests");
	}
	 
	@BeforeEach
	void init() {
		shape=new Shapes();
		System.out.println("Before Each Test");
	}
	
	
	@Test
	void testComputeSquareArea() {
		int actualResult=shape.computeSquareArea(24);
		int expectedResult=576;
		assertEquals(expectedResult, actualResult);
		
		System.out.println("Actual Test is Running");
	}
	
	@Test
	void testComputeCircleArea() {
		int actualResult=shape.computeCircleArea(5);
		int expectedResult=75;
		assertEquals(expectedResult, actualResult, "Circle area calculation is wrong");
		
		System.out.println("Actual Test is Running");
	}

	@AfterEach
	void destroy() {
		System.out.println("After Each Test Clean up");
	}
	
	@AfterAll
	static void afterAllTest() {
		System.out.println("After All Tests");
	}
	
}
