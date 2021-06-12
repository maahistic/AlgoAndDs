package com.learning.challenges;

import java.util.Scanner;

public class InfyAss9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		for (int i = 0; i < n; i++) {
			String input = s.nextLine();
			while (true) {
				if (input.equals(input.replaceAll("(?i)(\\p{L})\\1", "$1"))) {
					System.out.println(input);
					break;
				}
				input = input.replaceAll("(?i)(\\p{L})\\1", "$1");
			}
		}
	}

}
