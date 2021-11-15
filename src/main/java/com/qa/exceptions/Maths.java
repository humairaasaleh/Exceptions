package com.qa.exceptions;

public class Maths {
	public void divide(int a, int b) throws DivideByZeroException, LargerNumberException {

		if (a == 0 || b == 0) {
			DivideByZeroException dz = new DivideByZeroException();
			throw dz;
		}
		
		if (b>a) {
			LargerNumberException l = new LargerNumberException();
			throw l;
		}
		int result;
		result = a / b;

		System.out.println("The answer is: " + result);
	}

}
