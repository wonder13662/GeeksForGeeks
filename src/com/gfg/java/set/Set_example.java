package com.gfg.java.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_example {
	
	// https://www.geeksforgeeks.org/set-in-java/

	private Set_example() {}

	public static void main(String[] args) {
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

}
