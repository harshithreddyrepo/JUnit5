package com.telusko;

public class Reverse {

	public int[] reverseMutipleTimes(int[] arr) {
		for(int k=0; k<10000000; k++) {
			for(int i=0, j=arr.length-1; i<j; i++, j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

		}
					
		return arr;
	}
}
