package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ShapesTest {

	Shapes shapes=new Shapes();

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testComputeSquareArea() {
		int actualResult=shapes.computeSquareArea(24);
		int expectedResult=576;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_21)
	void testComputeCircleArea() {
		int actualResult=shapes.computeCircleArea(5);
		int expectedResult=75;
		assertEquals(expectedResult, actualResult, "Circle area calculation is wrong");
	}
	
}
