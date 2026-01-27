package com.telusko;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString obj=new ReverseString();
		String actualResult=obj.reverse("JAVA");
		String expectedResult="AVAJ";
		assertEquals(expectedResult, actualResult);
	}

}
