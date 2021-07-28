package com.w2a.javaExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Map<String, String> map = new HashMap<String, String>();
		map.put("firstname", "Raman");
		map.put("lastname", "Arora");	
		map.put("subject", "selenium");
		map.put("location", "india");
		map.put("firstname", "Rahul");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("firstname"));
		Set<String> var = map.keySet();
		for(String vars:var) {
			System.out.println("The key is "+vars+" and the value is "+map.get(vars));
		}
*/
		Map<String, List<String>> mp = new HashMap<String, List<String>>();
		List<String> lst = new ArrayList<String>();
		lst.add("trainer@gmail.com");
		lst.add("selenium@gmail.com");
		lst.add("python@gmail.com");
		
		mp.put("emails", lst);
		Set<String> var = mp.keySet();
		
		for(String vars:var) {
			System.out.println("The key is "+vars+" and the value is "+mp.get(vars));
		}
		
		
	}

}
