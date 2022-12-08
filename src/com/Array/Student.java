package com.Array;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=scanner.nextInt();
		int a1=0;
		int a2=1;
		for(int i=1;i<=num;i++) {
			System.out.println(a1);
			int temp=a1;
			a1=a1+a2;
			a2=temp;
		}
	}

}
