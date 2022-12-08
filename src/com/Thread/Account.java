package com.Thread;

public class Account {
	private int balance = 5000;

	public int getbalance() {
		return balance;
	}

	public  int m1(int amount) {
		balance=balance-amount;
		return balance;
		
		
	}

}
