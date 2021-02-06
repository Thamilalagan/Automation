package com.w2a.testcases;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("Raman");
		set.add("Way2Automation");
		set.add("Selenium");
		set.add("Appium");
		set.add("Raman");
		System.out.println(set);
		
		/*for(String a :set) {
			System.out.println(a);
		}*/
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String var = itr.next();
			if(var.equals("Appium")) {
			System.out.println(var);
		}
		}

	}

}
