package com.telusko;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString obj=new ReverseString();
		String actualResult=obj.reverse("JAVA");
		String expectedResult="AVAJ";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	 public void test1() {
		EditString obj=new EditString();
		String actualResult=obj.downCase("JAVA");
		String expectedResult="java";
		assertEquals(expectedResult, actualResult);
	}

}
