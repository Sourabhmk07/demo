package com.Collections;

import java.util.HashMap;

public class HasMap {

	public HashMap<Integer,String> getStudent(){
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
		hash.put(11, "Sourabh");
		hash.put(12, "Sonu");
		hash.put(13, "Smk");
		return hash;
		
	}
	public static void main(String[] args) {
		HasMap hm=new HasMap();
		//System.out.println(hm.getStudent());
		HashMap<Integer,String> ha=hm.getStudent();
		System.out.println(ha);
		
	}
}
