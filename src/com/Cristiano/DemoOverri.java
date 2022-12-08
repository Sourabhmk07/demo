package com.Cristiano;

public class DemoOverri extends MethOver{

	@Override
	void m1() {
		System.out.println("this is Child Class Legacy with ");
		int a=10;
		int b=10;
		int c;
		System.out.println(c=a+b);
		super.m1();
	}
	public static void main(String[] args) {
		DemoOverri d=new DemoOverri();
		d.m1();
		
	}
	

}
