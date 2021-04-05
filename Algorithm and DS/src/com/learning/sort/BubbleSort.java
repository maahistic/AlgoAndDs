package com.learning.sort;

public class BubbleSort {

	public void sort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 5, 4, 7, 2, 4, 5, 0, 7 };
		for (int c : x)
			System.out.println(c);
		System.out.println("=================");
		new SelectionSort().sort(x);
		for (int c : x)
			System.out.println(c);
	}

}
