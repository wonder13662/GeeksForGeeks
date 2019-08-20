package com.gfg.java.navigableSet;

import java.util.TreeSet;

public class GfgNavigableSet {
	
	// https://www.geeksforgeeks.org/treeset-pollfirst-method-in-java/

	private GfgNavigableSet() {}

	public static void main(String[] args) {
//		example_01();
//		example_02();
		example_03();
	}
	
	private static void example_01() {
		// creating TreeSet
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		// Adding element to the TreeSet
		ts.add(0);
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		
		// before removing element
		System.out.println("Before removing " + "element from TreeSet: " + ts);
		
		// first element is removed
		System.out.println("First lowest element " + "removed is : " + ts.pollFirst());
		System.out.println("After removing element" + " from TreeSet: " + ts);
	}
	
	private static void example_02() {
        // creating TreeSet 
        TreeSet<String> ts = new TreeSet<String>();
        
        // removing element when TreeSet is empty 
        System.out.println("pollFirst() method when " + "TreeSet is empty  :  " + ts.pollFirst());
        
        // adding element to the TreeSet
        ts.add("Geeks"); 
        ts.add("for"); 
        ts.add("Geek"); 
        
        // before removing element
        System.out.println("Before removing element from" + " TreeSet: " + ts);
        
        // first element is removed
        System.out.println("First lowest element removed is : " + ts.pollFirst()); 
        System.out.println("After removing element " + "from TreeSet: " + ts);         
	}
	
	private static void example_03() {
        // creating TreeSet 
        TreeSet<String> ts = new TreeSet<String>();
        
        // before removing element 
        System.out.println("Before removing " + "element from TreeSet: " + ts); 
  
        // first element is removed 
        System.out.println("First lowest element " + "removed is : " + ts.pollFirst()); 
        System.out.println("After removing element" + " from TreeSet: " + ts);
	}	
}
