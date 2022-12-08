package com.Array;

import java.util.Scanner;

public class Pri {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your no");
		int p=s.nextInt();
		int count=0; 
		for(int i=p;i>0;i--) {
			if(p%i==0) {
				count++;
			}
		}
			if(count>2) {
				System.out.println(p+ " Is not prime number ");
			}
			else {
				System.out.println( p + " Is prime number ");
			}
			
			
		}
		
	

}
