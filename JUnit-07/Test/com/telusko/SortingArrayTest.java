package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testException() {
		SortingArray sort=new SortingArray();
		assertThrows(NullPointerException.class, ()->sort.sortingArray(null));
		// Test case will fail if the expected Exception is not raised.
	}

	@Test
	void testPerformance() {
		SortingArray sort=new SortingArray();
		int[] unSorted= {5,2,6};
		assertTimeout(Duration.ofMillis(10), ()->sort.sortingArray(unSorted));
	}
	
}
