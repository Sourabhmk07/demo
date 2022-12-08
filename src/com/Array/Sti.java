package com.Array;

public class Sti {
	public static void main(String[] args) {
		String s=new String("i am iron man ");
		String s1=new String("Kamble");
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.compareTo(s1));
		String str="i am iron man";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
			
			
		}
		System.out.println(count);
		
	}

}
