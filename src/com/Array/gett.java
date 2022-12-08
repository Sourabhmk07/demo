package com.Array;

import java.util.Scanner;

public class gett {
	public static void getuserinput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your roll no ");
		int r=s.nextInt();
		System.out.println("Enter your name");
		String n=s.next();
		System.out.println("Enter your city");
		String c=s.next();
		
		Info i=new Info();
		i.setCity(c);
		i.setName(n);
		i.setRollno(r);
		
		System.out.println("City is" + i.getCity());
		System.out.println("Name is " + i.getName());
		System.out.println("roll no " + i.getRollno());
		
	}
	public static void main(String[] args) {
		getuserinput();
	}

}
