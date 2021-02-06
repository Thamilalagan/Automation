package com.w2a.testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		list.add(10);
		list.add("Raman");
		list.add(10.25);
		list.add('c');
		list.add(true);
		list.add(null);
		list.add("Raman");
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		//list.add(10.25);
		int var = list.get(0);
		System.out.println(var);*/
		
		int var = (Integer)list.get(0);
		System.out.println(20+var);
		/*list.remove(5);
		System.out.println(list);
		System.out.println(list.size());*/
		
		
		/*for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		/*for(Object var:list) {
			System.out.println(var);
		}*/
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
