package com.Thread;

public class MulTh extends Thread {
	public void run() {
		for (int i=1;i<=2;i++) {
			this.grtNew();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(i);
		}
		
			 
			
			
		
	}
	public void grtNew() {
		System.out.println("Sourabh ok");
	}

	public static void main(String[] args) {
		//Thread t=new Thread();
		MulTh m=new MulTh();
		System.out.println(m.getPriority());
		m.start();
		m.grtNew();
		
		
		
	}

}
