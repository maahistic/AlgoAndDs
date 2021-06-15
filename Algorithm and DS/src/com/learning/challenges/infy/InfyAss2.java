package com.learning.challenges.infy;

import java.util.Scanner;

public class InfyAss2 {
	static int met[][];
	static int ret;
	static int num;
	static char forest[][];

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		forest = new char[num][num];
		met = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				forest[i][j] = sc.next().charAt(0);
				if (forest[i][j] == 'W') {
					met[i][j] = 1;
				}
			}
		}
		int m = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (forest[i][j] == 'T' && met[i][j] == 0) {
					met[i][j] = 1;
					m = Math.max(treeCount(i, j, 0), m);
				}
			}
		}
		System.out.println(m != 0 ? m : -1);
	}

	static int treeCount(int i, int j, int count) {
		ret = count + 1;
		if ((j + 1 < num) && forest[i][j + 1] == 'T' && met[i][j + 1] == 0) {
			met[i][j + 1] = 1;
			treeCount(i, j + 1, ret);
		}
		if ((i + 1 < num) && forest[i + 1][j] == 'T' && met[i + 1][j] == 0) {
			met[i + 1][j] = 1;
			treeCount(i + 1, j, ret);
		}
		if ((j - 1 >= 0) && forest[i][j - 1] == 'T' && met[i][j - 1] == 0) {
			met[i][j - 1] = 1;
			treeCount(i, j - 1, ret);
		}
		if ((i - 1 >= 0) && forest[i - 1][j] == 'T' && met[i - 1][j] == 0) {
			met[i - 1][j] = 1;
			treeCount(i - 1, j, ret);
		}
		return ret;
	}
}
