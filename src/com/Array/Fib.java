package com.Array;

import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=s.nextInt();
		int v1=0;
		int v2=1;
		for(int i =1;i<=num;i++) {
			System.out.println(v1);
			int temp=v1;
			v1=v1+v2;
			v2=temp;
			
		}
		
		
	}

}
