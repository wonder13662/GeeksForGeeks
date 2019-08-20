package com.gfg.java.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GfgSet {
	
	// https://www.geeksforgeeks.org/set-in-java/

	private GfgSet() {}

	public static void main(String[] args) {
		//example_01();
		example_02();
	}
	
	private static void example_01() {
		// Set demonstration using Hashset
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");
		System.out.println("Set output without the duplicates");
		
		System.out.println(hash_Set);
		
		// Set demonstration using Treeset
		System.out.println("Sorted Set after passing into Treeset");
		Set<String> tree_Set = new TreeSet<String>(hash_Set);
		System.out.println(tree_Set);
	}
	
	// Java code for demonstrating union, intersection and difference on Set
	private static void example_02() {
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
		
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
		
		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set");
		System.out.println(union);
		
		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);
		
		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference of the two Set");
		System.out.println(difference); 
	}

}
