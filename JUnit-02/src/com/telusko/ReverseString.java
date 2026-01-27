package com.telusko;

public class ReverseString {

	public String reverse(String str) {
		String result="";
		for(int i=str.length()-1; i>=0; i--) {
			result=result+str.charAt(i);
		}
		return result;
	}
}
