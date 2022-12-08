package com.A;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);
		System.out.println(v.capacity());
		v.remove(2);
		System.out.println(v);
		for (int i=1;i<=10;i++)
			v.add(i);
		System.out.println(v);
	}

}
