package com.Cristiano;

public class Account {
	private int balance=3000;
	/*public int balance() {
		return balance;
	}*/
	public void withdraw(int amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("Insuff Funds");
		}
		balance=balance-amount;
	}
	public static void main(String[] args) {
		Account a=new Account();
		System.out.println("Current Balance " + a.balance);
		a.withdraw(200);
		System.out.println("Current Balance " + a.balance);
	}

}
