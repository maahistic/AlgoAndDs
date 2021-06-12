package com.learning.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class InfyAss3 {
//Java
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 0;
		String smallest = "";
		String str;
		for (int i = 0; i < num; i++) {
			k = sc.nextInt();
			str = sc.nextLine();
			str = str.trim();
			smallest = str;
			if (k == 1) {
				for (int j = 0; j < str.length(); j++) {
					str = str.substring(1) + str.substring(0, 1);
					smallest = str.compareTo(smallest) < 0 ? str : smallest;
				}
				System.out.println(smallest);
			} else {
				char[] arr = str.toCharArray();
				Arrays.sort(arr);
				System.out.println(String.valueOf(arr));

			}
		}
	}
}
