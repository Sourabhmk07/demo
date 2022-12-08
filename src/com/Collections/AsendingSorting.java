package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class AsendingSorting {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(20);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
