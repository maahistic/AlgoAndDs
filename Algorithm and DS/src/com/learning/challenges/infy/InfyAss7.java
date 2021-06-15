package com.learning.challenges.infy;

import java.util.Scanner;

public class InfyAss7 {

	// Done

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		Integer[] min = new Integer[s];
		Integer[] max = new Integer[s];

		Integer minC = Integer.MAX_VALUE;
		Integer maxC = Integer.MIN_VALUE;
		Integer ss = 0;
		Integer cc = 0;
		for (int i = 0; i < s; i++) {
			min[i] = scan.nextInt();
			max[i] = scan.nextInt();
			minC = min[i] < minC ? min[i] : minC;
			maxC = max[i] > maxC ? max[i] : maxC;
		}
		for (int j = maxC; j >= minC; j--) {
			int tmp = 0;
			for (int x = 0; x < s; x++) {
				if (j <= max[x] && j >= min[x])
					tmp++;
			}
			if (ss <= tmp) {
				ss = tmp;
				cc = j;
			}

		}
		System.out.println(cc + " " + ss);
	}

}
