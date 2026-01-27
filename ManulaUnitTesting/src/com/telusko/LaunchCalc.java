package com.telusko;

public class LaunchCalc {

	public static void main(String[] args) {


		Calc calsi=new Calc();
		
		int q = calsi.divide(10, 5);
		if(q==2) {
			System.err.println("Tast case passed");
		}else {
			System.err.println("Test case failed");
		}

	}

}
