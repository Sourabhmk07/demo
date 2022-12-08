package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		List<String> comp = new ArrayList<String>();
		comp.add("FE");
		comp.add("SE");
		comp.add("TE");
		comp.add("BE");

		List<String> mech = new ArrayList<String>();
		mech.add("FE");
		mech.add("SE");
		mech.add("TE");
		mech.add("BE");

		List<String> chem = new ArrayList<String>();
		chem.add("FE");
		chem.add("SE");
		chem.add("TE");
		chem.add("BE");

		List<String> civil = new ArrayList<String>();
		civil.add("FE");
		civil.add("SE");
		civil.add("TE");

		// key >>college value >>dept
		HashMap<String, List<String>> college = new HashMap<String, List<String>>();
		college.put("Computer", comp);
		college.put("Mechanical", mech);
		college.put("Chemical", chem);
		college.put("Civil", civil);

		// System.out.println(college);

		HashMap<String, HashMap<String, List<String>>> MIT = new HashMap<String, HashMap<String, List<String>>>();
		MIT.put("MIT", college);

		Set<String> set = MIT.keySet();
		for (String s : set)
			// System.out.println(s);
			System.out.println(s + " " + MIT.get(s));
		// System.out.println(MIT.get(s));

	}

}
