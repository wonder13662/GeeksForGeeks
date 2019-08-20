package com.gfg.java.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class GfgPriorityQueue {
		
	// https://www.geeksforgeeks.org/priority-queue-class-in-java-2/

	private GfgPriorityQueue() {}

	public static void main(String[] args) {
//		example_01();
		example_02();
//		example_03();
	}
	
	private static void example_01() {
		// Creating empty priority queue
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		
		// Adding items to the pQueue using add()
		pQueue.add("C");
		pQueue.add("C++");
		pQueue.add("Java");
		pQueue.add("Python");
		
		// Printing the most priority element
		System.out.println("\nHead value using peek function: " + pQueue.peek());
		
		// Printing all elements
		System.out.println("The queue elements:");
		Iterator<String> itr = pQueue.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// Removing the top priority element (or head) and
		// printing the modified pQueue using poll()
		pQueue.poll();
		System.out.println("\nAfter removing an element with poll function:");
		Iterator<String> itr2 = pQueue.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());
		
		// Removing Java using remove()
		pQueue.remove("Java");
		System.out.println("\nAfter removing Java with remove function:");
		Iterator<String> itr3 = pQueue.iterator();
		while(itr3.hasNext())
			System.out.println(itr3.next());
		
		// Check if an element is present using contains()
		boolean b = pQueue.contains("C");
		System.out.println("\nPriority queue contains C or not?: " + b);
		
		// Getting objects from the queue using toArray()
		// in an array and print the array
		Object[] arr = pQueue.toArray();
		System.out.println("\nValue in array: ");
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Value: " + arr[i].toString());
	}
	
	private static void example_02() {
		PriorityQueue<String> pQueue = new PriorityQueue<String>(1);
		pQueue.add("First");
		pQueue.add("Second");
		pQueue.add("Third");
		
		Iterator<String> itr = pQueue.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
	
	private static void example_03() {
		
	}
	
}
