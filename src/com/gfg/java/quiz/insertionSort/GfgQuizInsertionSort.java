package com.gfg.java.quiz.insertionSort;

import java.util.Scanner;

public class GfgQuizInsertionSort {
	// https://practice.geeksforgeeks.org/problems/sort-the-array/0
	public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        
        for(int i =0;i<testcases;i++){
            int size = sc.nextInt();    
            int[] arr = new int[size];
            
            for(int j=0;j<size;j++){
                int key = sc.nextInt();
                arr[j]=key;
            }
            
            insertionSort(arr);
            printArray(arr);
        }
        sc.close();
		
//		int[] arr = insertionSort(new int[] {1,2,3,4,5});
//		printArray(arr);
	}
	
	private static int[] insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
				printArray(arr);
			}
			arr[j + 1] = key;
			printArray(arr);
		}
		
		return arr;
	}
	
	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
