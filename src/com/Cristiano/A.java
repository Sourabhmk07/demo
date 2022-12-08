package com.Cristiano;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		al.forEach(aa->System.out.println("By lamda expresion" + aa));
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
			System.out.println("By Itreator>>" +itr.next());
		
	}
	
	 
	
		}

