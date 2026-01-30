package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;


class ReverseTest {
	
	Reverse reverse=new Reverse();

	//@Test
	@RepeatedTest(value = 5)
	void testSortingMultipleTimes_Performance(RepetitionInfo repInfo) {
		
		if(repInfo.getCurrentRepetition()==1) {
			int[] unSorted= {5,2,6};
			assertTimeout(Duration.ofMillis(10000), ()->reverse.reverseMutipleTimes(unSorted));
		}
		
		if(repInfo.getCurrentRepetition()==2) {
			int[] unSorted= {5,2,6};
			assertTimeout(Duration.ofMillis(1000), ()->reverse.reverseMutipleTimes(unSorted));
		}
		
		if(repInfo.getCurrentRepetition()==3) {
			int[] unSorted= {5,2,6};
			assertTimeout(Duration.ofMillis(100), ()->reverse.reverseMutipleTimes(unSorted));
		}
		
		if(repInfo.getCurrentRepetition()==4) {
			int[] unSorted= {5,2,6};
			assertTimeout(Duration.ofMillis(10), ()->reverse.reverseMutipleTimes(unSorted));
		}
		
		if(repInfo.getCurrentRepetition()==5) {
			int[] unSorted= {5,2,6};
			assertTimeout(Duration.ofMillis(1), ()->reverse.reverseMutipleTimes(unSorted));
		}
		
	}

	

}
