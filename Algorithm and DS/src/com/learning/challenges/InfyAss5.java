package com.learning.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class InfyAss5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			scan.nextInt();
			scan.nextLine();
			String str = scan.nextLine();
			int[] traveller = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
			int len = traveller.length;
			int count = 0;
			int subtotal = 0;
			Arrays.sort(traveller);

			if (len < 3)
				System.out.println(traveller[len - 1]);
			else if (len == 3)
				System.out.println(Arrays.stream(traveller) .sum());
			else if ((len & 1) == 0) {
				// for Even
				for (int j = len; len > 3; len -= 2) {
					subtotal += traveller[len - 1];
					count++;
				}
				System.out.println(subtotal + ((traveller[0] * count) + (traveller[1] * ((count * 2) + 1))));
			} else {
				// for Odd
				for (int j = len; len >= 3; len -= 2) {
					subtotal += traveller[len - 1];
					count++;
				}
				System.out.println(subtotal + (traveller[0] * count) + (traveller[1] * (((count - 1) * 2) + 1)));
			}

		}
	}
}
