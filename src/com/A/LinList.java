package com.A;

import java.util.Iterator;
import java.util.LinkedList;

public class LinList {
	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		
		Iterator<Integer> itr=ls.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		System.out.println("Next Method ");
		
		for(int i:ls)
			System.out.println(i);
		
		ls.forEach(ll->System.out.println(ll));
		
		

		
	}

}
