package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

//import javax.swing..Iterator;



public class ArrayListIntger1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList();
		al1.add(40);
		al1.add(50);
		al1.add(60);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i:al)
			System.out.println(i);
		
		al.forEach(ss->System.out.println(ss));
		
	
		
	}
	
	
	

}
