package com.Thread;

import java.util.Scanner;

public class PraticeSt {
	public static void main(String[] args) {
	String s=" i am Iron man ";
	int counter=0;
	//System.out.println(s.charAt());
	for (int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch== ' ') {
			counter++;
		}
	}
	System.out.println(counter);
		
	}

	

}
