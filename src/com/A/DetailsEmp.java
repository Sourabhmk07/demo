package com.A;

import java.util.ArrayList;
import java.util.Collections;

public class DetailsEmp {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(7, "Sourabh", "10000"));
		al.add(new Employee(55, "Anu", "10000"));
		al.add(new Employee(7, "Vishal", "10000"));
		Collections.sort(al,new NameSorting());
		System.out.println(al);
		
	}

}
