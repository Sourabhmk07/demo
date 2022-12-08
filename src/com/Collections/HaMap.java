package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HaMap {
	public static void main(String[] args) {
		List<String> mech=new ArrayList<String>();
		mech.add("F.Y");
		mech.add("S.Y");
		mech.add("T.Y");
		mech.add("B.Y");
		
		List<String> civil =new ArrayList<String>();
		civil.add("F.Y");
		civil.add("S.Y");
		civil.add("T.Y");
		civil.add("B.Y");
		
		HashMap<String, List<String>> dkteCollege=new HashMap<String,List<String>>();
		dkteCollege.put("Mechanical", mech);
		dkteCollege.put("Civil", civil);
		
		HashMap<String,HashMap<String, List<String>>> Shivaji_University=new HashMap<String,HashMap<String, List<String>>>();
		Shivaji_University.put("Shivaji_University", dkteCollege );
		Set<String> s=Shivaji_University.keySet();
		for(String str:s) {
			System.out.println(s +" "+Shivaji_University.get(s));
		}
		
		
		
		
		
	}

}
