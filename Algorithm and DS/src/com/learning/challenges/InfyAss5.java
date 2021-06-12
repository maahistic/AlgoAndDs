package com.learning.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class InfyAss5 {
//done
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			int len = scan.nextInt();
			scan.nextLine();
			String str = scan.nextLine();
			int[] traveller = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
			int subtotal = 0;
			Arrays.sort(traveller);
			while (len >= 4) {
				int opt1 = traveller[1] + traveller[0] + traveller[len - 1] + traveller[1];
				int opt2 = traveller[len - 1] + traveller[0] + traveller[len - 2] + traveller[0];
				subtotal += opt1 < opt2 ? opt1 : opt2;
				len -= 2;
			}
			if (len == 3)
				subtotal += traveller[0] + traveller[1] + traveller[2];
			if (len == 2)
				subtotal += traveller[1];
			if (len == 1)
				subtotal += traveller[0];
			System.out.println(subtotal);
		}
	}
}
