package com.Thread;

public class AccountMain {
	public static void main(String[] args) {
		AccountDetails AccountDetails=new AccountDetails();
		Thread thread=new Thread(AccountDetails);
		Thread thread1=new Thread(AccountDetails);
		thread.setName("Sourabh");
		thread1.setName("Suraj");
		
		
	}

}
