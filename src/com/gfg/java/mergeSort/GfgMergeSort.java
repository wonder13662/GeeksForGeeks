package com.gfg.java.mergeSort;

public class GfgMergeSort {
	// (Description) - https://www.geeksforgeeks.org/merge-sort/
	// (Quiz) - https://practice.geeksforgeeks.org/problems/merge-sort/1/?ref=self
	public static void main(String[] args) {
		GfgMergeSort obj = new GfgMergeSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		obj.mergeSort(arr, 0, arr.length - 1);
		obj.printArray(arr);
	}
	
	private void mergeSort(int[] arr, int left, int right) {
		if(left == right) return;
		
		int middle = (left + right)/2;
		mergeSort(arr, left, middle);
		mergeSort(arr, middle + 1, right);
		merge(arr, left, middle, right);
	}
	
	private void merge(int arr[], int left, int middle, int right) {
		int keyNotAssigned = -1;
		int curCursor = 0; 
		int length = (right - left) + 1;
		int leftCursor = left;
		int leftKey = arr[leftCursor];
		int rightCursor = middle + 1;
		int rightKey = arr[rightCursor];
		
		// merge시에 각 범위에 대한 값의 복사본을 만들어야 할까?
		int[] arrMerged = new int[length];
		while(curCursor <= (length - 1)) {
			if(leftKey > keyNotAssigned && (leftKey < rightKey || rightKey == keyNotAssigned)) {
				arrMerged[curCursor] = leftKey;
				leftKey = (leftCursor < middle)?arr[++leftCursor]:keyNotAssigned;
			} else if(rightKey > keyNotAssigned) {
				arrMerged[curCursor] = rightKey;
				rightKey = (rightCursor < right)?arr[++rightCursor]:keyNotAssigned;
			}
			curCursor++;
		}
		
		for (int i = 0; i < arrMerged.length; i++) {
			arr[left + i] = arrMerged[i];
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
