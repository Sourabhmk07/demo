package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class EmpolyeeMain {
	public List<Emplyee> getEmployee(){
		List<Emplyee> list=new ArrayList<Emplyee>();
		list.add(new Emplyee(11, "Sourabh", "Nipani"));
		Emplyee emp=new Emplyee(12, "So", "kol");
		System.out.println(emp);
		return list;
		
	}
	public static void main(String[] args) {
		EmpolyeeMain main=new EmpolyeeMain();
		System.out.println(main.getEmployee());
		
		
	}

}
