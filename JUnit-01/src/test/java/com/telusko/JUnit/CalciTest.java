package com.telusko.JUnit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalciTest {

	@Test
	void test() {
		Calci cal=new Calci();
		int actualResult=cal.divide(10, 5);
		int expectedResult=2;
		assertEquals(expectedResult, actualResult);
	}

}
