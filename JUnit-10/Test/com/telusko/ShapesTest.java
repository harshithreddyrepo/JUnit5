package com.telusko;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
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
		
		assumeTrue(true); // The test case will be execute if the assumption is correct otherwise it will be skipped.
		
		int actualResult=shapes.computeSquareArea(24);
		int expectedResult=57;
		assertEquals(expectedResult, actualResult);
		
	  //	assumeFalse(true);
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_21)
	void testComputeCircleArea() {
		
		assumeFalse(false);
		
		int actualResult=shapes.computeCircleArea(5);
		int expectedResult=75;
		assertEquals(expectedResult, actualResult, "Circle area calculation is wrong");
	}
	
}
