package com.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List list =new ArrayList();
		
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Om");
		list.add("Jay");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(12.41f);
		list.add(10);
		list.add(20);
		
		System.out.println("List is:"+list);
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		
		System.out.println(list.contains(20));
		
		list.remove(false);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.remove(list.lastIndexOf(20)));
		System.out.println(list);
		
		System.out.println(list.indexOf(20));
		
		
		list.clear();
		System.out.println(list);
		
		System.out.println("-----------");
		
		//Generic 
		
		List <String> names =new ArrayList <String>();
		
		names.add("Dev");
		names.add(null);
		names.add("Adi");
		names.add("Sham");
		names.add("King");
		names.add("Queen");
		names.add("Adi");
		
System.out.println("Original List: " + names);
        
        System.out.println("Size: " + names.size());
        
        System.out.println("Contains 'King': " + names.contains("King"));
        
        System.out.println("Index of 'Adi': " + names.indexOf("Adi"));
        
        System.out.println("Last index of 'Adi': " + names.lastIndexOf("Adi"));
        
        names.remove("Queen");
        System.out.println("After removing 'Queen': " + names);
        
        names.remove(1);
        System.out.println("After removing index 1: " + names);
        
        names.set(2, "Emperor");
        System.out.println("After setting index 2: " + names);
        
        List<String> newNames = new ArrayList<String>();
        newNames.add("X");
        newNames.add("Y");
        newNames.add("Z");
        
        names.addAll(newNames);
        System.out.println("After addAll: " + names);
        
        names.addAll(2, newNames);
        System.out.println("After addAll at index 2: " + names);
        
        System.out.println("Sublist (2-5): " + names.subList(2, 5));
        
        System.out.println("Get index 3: " + names.get(3));
        
        names.replaceAll(s -> s != null ? s.toUpperCase() : null);
        System.out.println("After replaceAll: " + names);
        
        names.sort(null);
        System.out.println("After sorting: " + names);
        
//        names.clear();
//        System.out.println("After clear: " + names);
//        
//        System.out.println("Is empty: " + names.isEmpty());
//		
		//Traversing
        Iterator<String> i = names.iterator();
        while(i.hasNext()) {
        	String nm = i.next();
        	System.out.println(nm + " ");      	
        }
        
        System.out.println();
        System.out.println(names);
        
        ListIterator<String> li =names.listIterator(names.size());
        
        while(li.hasPrevious()) {
        	String nm = li.previous();
        	System.out.println(nm + " ");      	
        }
	}
}	
