package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingO {
	public static void main(String[] args) {
		ArrayList<ComprableMapAD> al=new ArrayList<ComprableMapAD>();
		al.add(new ComprableMapAD(7, "Sourabh", "Nipani"));
		al.add(new ComprableMapAD(10, "Anirudha", "Pune"));
		al.add(new ComprableMapAD(1, "Vishal", "Kolhapur") );
		Collections.sort(al);
		System.out.println(al);
		
	}

}
