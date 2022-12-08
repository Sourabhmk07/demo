package com.Thread;

public class AccountDetails implements Runnable {
	Account account=new Account();

	@Override
	public void run() {
		for(int j=1;j<5;j++);
		makeWithdraw(500);
		if(account.getbalance()<0)
			System.out.println("Account Empty");
		
	}
	public void makeWithdraw(int amt) {
		if(account.getbalance()>=amt) {
			System.out.println(Thread.currentThread().getName() +"going withdraw" +amt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int bal=account.m1(amt);
			System.out.println("Account aval balance" + bal);
			
		}
	}

}
