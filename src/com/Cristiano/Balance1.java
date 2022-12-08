package com.Cristiano;

public class Balance1 {
	
	public static void main(String[] args) {
		
		int balance=5;
		
		if(balance<0) {
			
			throw new InsuffExcption("insufficent balance");
			
			
		}
		else {
			System.out.println("balance is sufficent " + balance);
		}
	}

}
