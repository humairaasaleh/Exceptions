package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		
		try {
			
			Maths m = new Maths();
			m.divide(10, 20);
			} catch(DivideByZeroException e) {
				e.handle();
				e.printStackTrace();
			}catch(LargerNumberException l) {
				l.handle2();
				l.printStackTrace();
			}
	}
}
