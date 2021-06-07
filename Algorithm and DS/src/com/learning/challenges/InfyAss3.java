package com.learning.challenges;

import java.util.Scanner;

public class InfyAss3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();

		for (int p = 0; p < count; p++) {
			String lex = "";
			String tmp = scan.nextLine();
			String[] arr = tmp.split(" ");
			String name = arr[1];
			int k = Integer.parseInt(arr[0]);
			boolean flag = true;
			while (true) {
				char temp = name.charAt(0);
				for (int i = 1; i < k && i < name.length(); i++) {
					if (name.charAt(i) < temp) {
						temp = name.charAt(i);
					}
				}
			}
		}
	}
}
