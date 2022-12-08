package com.Array;

import java.util.Scanner;

public class Student1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int number=s.nextInt();
		int c=number;
		int sum=0;
		while(number!=0) {
			int r=number%10;
			sum=sum+(r*r*r);
			number=number/10;
		}
		if(number==c) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("not Armstrong");
		}

	}
}
