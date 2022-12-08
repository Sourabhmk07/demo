package com.Array;

public class Demo extends Demo1 {

	@Override
	void m1() {
		System.out.println("this is child class m1");
		//super.m1();
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
	}
	


}
