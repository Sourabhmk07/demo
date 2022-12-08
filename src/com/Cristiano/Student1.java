package com.Cristiano;

public class Student1 {
	
	public static Student1 addId() {
		int roll=10;
		return new Student1();
		
		
	}
	private char[] roll;
	public static void main(String[] args) {
		Student1 s=addId();
		System.out.println(s.roll);
	}

}
