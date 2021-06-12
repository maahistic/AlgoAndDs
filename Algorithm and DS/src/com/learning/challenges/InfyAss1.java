package com.learning.challenges;

import java.util.Scanner;

public class InfyAss1 {
//1TC pending
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(",");
		boolean found = true;
		int[] eq = new int[str.length];
		for (int x = 0; x < eq.length; x++) {
			eq[x] = Integer.parseInt(str[x].trim());
		}

		int left, right;
		for (int i = 0; i < str.length; ++i) {

			left = 0;
			for (int j = 0; j < i; j++)
				left += eq[j];

			right = 0;
			for (int j = i + 1; j < str.length; j++)
				right += eq[j];

			if (left == right) {
				System.out.println(i);
				found = false;
			}
		}
		if (found)
			System.out.println(-1);
	}
}