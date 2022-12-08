package com.A;

import java.util.Stack;

public class Sttack {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(100);
		s.push(20);
		s.push(30);
		System.out.println(s);
		s.peek();
		System.out.println(s);
		System.out.println(s.peek());
	}

}
