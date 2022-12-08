package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListStr {
	public String getreverse(String name) {
		String rev="";
		for(int i=name.length() -1; i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		return rev;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayListStr a=new ArrayListStr();
		System.out.println("enter name");
		String kk=s.next();
		
		
		System.out.println(a.getreverse(kk));
	
		
		
		
		
		
		
		
	}

}
