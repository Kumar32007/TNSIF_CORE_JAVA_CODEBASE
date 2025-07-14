package com.day12;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        
        System.out.println(q);
        
        int PositionPeek = q.peek();
        System.out.println("Using Peek Method First value from Queue is : "+PositionPeek);
        
        int PositionElement = q.element();
        System.out.println("Using Element Method First value of queue is : "+PositionElement);
        
        Iterator itr = q.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next()+"\t");
        }
        System.out.println();
        System.out.println(q.poll());
        System.out.println(q);
        
        System.out.println(q.retainAll(q));
        
        q.offer(7);
        System.out.println("After offer: " + q);
        
        System.out.println("Size: " + q.size());
        
        System.out.println("Contains 3? " + q.contains(3));
        
        q.remove();
        System.out.println("After remove: " + q);
        
        q.clear();
        System.out.println("After clear: " + q);
        
        System.out.println("Is empty? " + q.isEmpty());
        
        q.add(10);
        q.add(20);
        q.add(30);
        Object[] array = q.toArray();
        System.out.print("Array: ");
        for(Object num : array) {
            System.out.print(num + " ");
        }
    }
}