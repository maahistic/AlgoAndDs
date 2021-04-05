package com.learning.sort;
public class SelectionSort {

	public void sort(int[] arr) {
		int len = arr.length;

		int min = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i]= arr[min];
			arr[min] = tmp;
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {5,4,7,2,4,5,0,7};
		for(int c : x)
			System.out.println(c);
		System.out.println("=================");
		new SelectionSort().sort(x);
		for(int c : x)
			System.out.println(c);
	}

}
