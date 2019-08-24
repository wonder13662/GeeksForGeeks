package com.gfg.java.quiz.sortTheArray;

import java.util.Scanner;

public class GfgSortTheArray {
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
            
            bubbleSort(arr);
            printArray(arr);
        }
        sc.close();
	}
	
	private static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j] >  arr[j+1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
