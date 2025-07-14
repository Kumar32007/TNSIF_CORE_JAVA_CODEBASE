package com.day12;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class ExDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Om");
        deque.add("jay");
        deque.add("ram");
        deque.add("sham");
        deque.add("kiran");
        deque.add("rohan");
        
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        
        for(String str : deque) {
            System.out.println("Queue is:" + str);
        }
        System.out.println(deque);

        deque.addFirst("First");
        System.out.println("After addFirst: " + deque);
        
        deque.addLast("Last");
        System.out.println("After addLast: " + deque);
        
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());
        
        deque.offer("Offer");
        System.out.println("After offer: " + deque);
        
        deque.offerFirst("OfferFirst");
        System.out.println("After offerFirst: " + deque);
        
        deque.offerLast("OfferLast");
        System.out.println("After offerLast: " + deque);
        
        System.out.println("Element: " + deque.element());
        
        System.out.println("Size: " + deque.size());
        
        System.out.println("Contains 'ram'? " + deque.contains("ram"));
        
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println(deque);
        
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println(deque);
        
        Iterator<String> descendingIterator = deque.descendingIterator();
        System.out.print("Descending order: ");
        while(descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();
        
        deque.push("Pushed");
        System.out.println("After push: " + deque);
        
        System.out.println("Pop: " + deque.pop());
        System.out.println(deque);
        
        deque.clear();
        System.out.println("After clear: " + deque);
        
        System.out.println("Is empty? " + deque.isEmpty());
    }
}