package com.Cristiano;

public class InsufficientBalanceException extends RuntimeException{
	private String message;
	public InsufficientBalanceException(String message) {
		super(message);
	}
	

}
