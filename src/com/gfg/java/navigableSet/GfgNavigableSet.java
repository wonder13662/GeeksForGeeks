package com.gfg.java.navigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class GfgNavigableSet {
		
	// https://www.geeksforgeeks.org/navigableset-pollfirst-method-in-java/

	private GfgNavigableSet() {}

	public static void main(String[] args) {
//		example_01();
//		example_02();
		example_03();
	}
	
	private static void example_01() {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		
		System.out.println("First lowest element removed is : " + ns.pollFirst());
	}
	
	private static void example_02() {
        NavigableSet<String> ns = new TreeSet<>();
        ns.add("A");
        ns.add("B");
        ns.add("C");
        ns.add("D");
        ns.add("E");
        ns.add("F");
        ns.add("G");
        
        System.out.println("First lowest element removed is : " + ns.pollFirst());
	}
	
	// https://www.geeksforgeeks.org/navigableset-java-examples/
	private static void example_03() {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		
		// Get a reverse view of the navigable set
		NavigableSet<Integer> reverseNs = ns.descendingSet();
		
		// Print the normal and reverse view
		System.out.println("Normal order: " + ns);
		System.out.println("Reverse order: " + reverseNs);
		
		NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
		System.out.println("3 or more: " + threeOrMore);
		System.out.println("lower(3): " + ns.lower(3));
		System.out.println("floor(3): " + ns.floor(3));
		System.out.println("higher(3): " + ns.higher(3));
		System.out.println("ceiling(3): " + ns.ceiling(3));
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollLast(): " + ns.pollLast());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("pollLast(): " + ns.pollLast());
		
	}
	
	// Bonus!
	// What is a view of a collection?
	// https://stackoverflow.com/questions/18902484/what-is-a-view-of-a-collection
	// https://en.wikipedia.org/wiki/View_(SQL)
	// In a database, a view is the result set of a stored query on the data, which the database users can query just as they would in a persistent database collection object. 
}
