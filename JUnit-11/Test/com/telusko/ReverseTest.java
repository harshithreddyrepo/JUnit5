package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ReverseTest {
	
	static Reverse reverse;
	
	static {
		reverse=new Reverse();
	}
	
	@Nested
	class RevrsingStringTest{
		@Test
		void testReverseWord() {
			String actualResult=reverse.reverseString("JAVA");
			String expectedResult="AVAJ";
			assertTrue(expectedResult.equals(actualResult));
		}
		
		@Test
		void testReverseLine() {
			String actualResult=reverse.reverseString("JAVA IS EASY");
			String expectedResult="YSAE SI AVAJ";
			assertTrue(expectedResult.equals(actualResult));
		}
	}

	@Nested
	class ReversingArrayTest{
		@Test
		void testReverseSorted() {
			int[] actualResult=reverse.reverseArray(new int[]{1,2,3,4});
			int[] expectedResutl= {4,3,2,1};
			assertArrayEquals(expectedResutl, actualResult);
		}
		
		@Test
		void testReverseUnsorted() {
			int[] actualResult=reverse.reverseArray(new int[]{5,2,1,4});
			int[] expectedResutl= {4,1,2,5};
			assertArrayEquals(expectedResutl, actualResult);
		}
	}
	
	

}
