package com.day13;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap ht = new LinkedHashMap();
		ht.put(101, 1000);
		ht.put(1012, 73.39);
		ht.put(203, "hjv");
		ht.put(401, 50);
		ht.put(101, 3500);
		ht.put(102, 7000);
		
		System.out.println(ht);
	}
}
