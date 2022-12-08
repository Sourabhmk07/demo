package com.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Seat {
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter yoyr no for check>>");
       int i=s.nextInt();
       int t=i;
       int r=0;
       while(i!=0) {
    	   r=r*10;
    	   r=r+ t%10;
    	   t=t/10;
    	   
       }
		if(r==i) {
			System.out.println("sdgfu");
		}
		
	}

}
