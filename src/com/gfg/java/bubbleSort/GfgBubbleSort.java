package com.gfg.java.bubbleSort;

public class GfgBubbleSort {
	// https://www.geeksforgeeks.org/bubble-sort/
	public static void main(String[] args) {
		GfgBubbleSort obj = new GfgBubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		obj.bubbleSort(arr);
		obj.printArray(arr);
	}
	
	private void bubbleSort(int arr[]) {
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
	
	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
