package com.day12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		li.addFirst(05);
		System.out.println(li);
		li.addLast(60);
		System.out.println(li);
		li.add(2, 23);
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);

		Iterator<Integer> i = li.iterator();
        while(i.hasNext()) {
        	int nm = i.next();
        	System.out.println(nm + " ");      	
        }
		
        ListIterator<Integer> listIterator = li.listIterator(li.size());
        while(listIterator.hasPrevious()) {
            int nm = listIterator.previous();
            System.out.print(nm + " ");
        }
        System.out.println();
		
	}

}
