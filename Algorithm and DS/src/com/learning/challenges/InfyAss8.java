package com.learning.challenges;

import java.util.Scanner;

public class InfyAss8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		for (int x = 0; x < num; x++) {

			String first = scan.nextLine();
			String second = scan.nextLine();
			int n = first.length();
			int m = second.length();

			boolean arr[][] = new boolean[n + 1][m + 1];
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= m; j++) {
					arr[i][j] = false;
				}
			}
			arr[0][0] = true;
			for (int i = 0; i < first.length(); i++) {
				for (int j = 0; j <= second.length(); j++) {
					if (arr[i][j]) {
						if (j < second.length() && (Character.toUpperCase(first.charAt(i)) == second.charAt(j)))
							arr[i + 1][j + 1] = true;
						if (!Character.isUpperCase(first.charAt(i)))
							arr[i + 1][j] = true;
					}
				}
			}
			System.out.println(arr[n][m] ? "YES" : "NO");
		}
	}
}
