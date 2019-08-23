package com.gfg.java.deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

// https://www.geeksforgeeks.org/deque-interface-java-example/
public class GfgDeque {

	private GfgDeque() {}

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		
		// We can add elements to the que in various ways
		deque.add("Element 1 (Tail)");	// add to Tail
		deque.addFirst("Element 2 (Head)");
		deque.addLast("Element 3 (Tail)");
		deque.push("Element 4 (Head)");	// add to Head
		deque.offer("Element 5 (Tail)");
		deque.offer("Element 6 (Head)");
		deque.offer("Element 7 (Tail)");
		
		System.out.println(deque + "\n");
		
		// Iterate through the queue elements
		System.out.println("Standard Iterator");
		Iterator iterator = deque.iterator();
	}
}
