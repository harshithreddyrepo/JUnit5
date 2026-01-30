package com.telusko;

public class Reverse {

	public String reverseString(String str) {
		
		char[] charArr=str.toCharArray();
		
		String result="";
		for(int i=0; i<charArr.length; i++) {
			result=charArr[i]+result;
		}
		return result;
	}
	
	public int[] reverseArray(int[] arr) {
		
		for(int i=0, j=arr.length-1; i<j; i++, j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		return arr;
	}
}
