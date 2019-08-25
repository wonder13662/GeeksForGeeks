package com.gfg.java.quickSort;

public class GfgQuickSort {
	// https://www.geeksforgeeks.org/quick-sort/
	// https://practice.geeksforgeeks.org/problems/quick-sort/1
	public static void main(String[] args) {
		GfgQuickSort obj = new GfgQuickSort();
		int arr[] = {10, 80, 30, 90, 40, 50, 70};
		obj.quickSort(arr, 0, arr.length - 1);
		obj.printArray(arr);
	}
	
	private void quickSort(int arr[], int low, int high) {
		if(low < high) {
			// pi is partitioning index, arr[pi] is now at right place
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi - 1); // Before pi
			quickSort(arr, pi + 1, high); // After pi
		}
	}
	
	/*
	 * This function takes last element as pivot, place the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot 
	 */
	private int partition(int[] arr, int low, int high) {
		// pivot (Element to be placed at right position)
		int pivot = arr[high];
		
		// index of smaller element
		int i = (low - 1);
		
		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than the pivot
			if(arr[j] < pivot) {
				i++; // increment index of smaller element
				// swap arr[i] and arr[j]
				swap(arr, i, j);
			}
		}
		// swap arr[i + 1] and arr[high]
		swap(arr, i + 1, high);
		
		return (i + 1);
	}
	
	private void swap(int[] arr, int left, int right) {
		if(left == right) return;
		
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
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
