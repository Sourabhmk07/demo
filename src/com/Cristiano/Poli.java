package com.Cristiano;

public class Poli {
	public int m1(int a, int b) {
		int c;
		c = a + b;
		System.out.println(c);
		return c = a + b;
	}

	public int m1(float a, int b, int c) {
		float d;
		d = a + b + c;
		System.out.println(d);

		return 0;

	}
	public static void main(String[] args) {
		Poli p=new Poli();
		p.m1(20, 30);
	}
}
