package com.A;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
     public List<Demo> getemp(){
    	 
    	 List<Demo> list=new ArrayList<Demo>();
    	 list.add(new Demo(7, "Sourabh", "500000"));
    	 return list;
     }
     public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println(d.getemp());
	}

}
