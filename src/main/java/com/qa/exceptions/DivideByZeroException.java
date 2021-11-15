package com.qa.exceptions;

public class DivideByZeroException extends Exception {
	
	public void handle() {
		System.out.println("Do not divide by 0");
	}

}
