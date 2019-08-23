package com.gfg.java.lambda;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/lambda-expressions-java-8/
public class GfgLambda {

	private GfgLambda() {}

	public static void main(String[] args) {
//		example1();
		example2();
	}
	
	private static void example1() {
		// lambda expression to implement above
		// functional interface. This interface 
		// by default implements abstractFun()
		FuncInterface fobj = (int x) -> System.out.println(2*x);
		
		// This calls above lambda expression and prints 10
		fobj.abstractFun(5);
	}
	
	private static void example2() {
		// Creating an ArrayList with elements
		// {1, 2, 3, 4}
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		// Using lambda expression to print all elements of arrL
		arrL.forEach(n -> System.out.println(n));
		
		// Using lambda expression to print even elements of arrL
		arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
	}
}
