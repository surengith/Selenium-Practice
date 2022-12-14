package com.Sel.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {

		// Types of List
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Map<Integer, String> map = new HashMap<Integer, String>();

		// List - It allow duplicate value
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(30);
		System.out.println("***********List**********");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));

		// Set - It doesn't  allow duplicate value
		set.add(10);
		set.add(20);
		set.add(30);
	

		System.out.println("***********Set**********");
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());

		// Map
		map.put(1, "Java");
		map.put(2, "Selenium");
		map.put(3, "API");
		System.out.println("***********Map**********");
		System.out.println(map.size());
		System.out.println(map.get(2));
	}

}
