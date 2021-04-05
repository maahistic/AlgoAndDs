package com.learning.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Generic {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int val = s.nextInt(); // Reading input from STDIN

		int x = 0;
		while (x != val) {
			System.out.println("in loop");
			String boy = s.next();
			String girl = s.next();
			System.out.println(boy +" "+girl);
			boolean rel = true;

			for (char ch : boy.toCharArray()) {
				if (girl.contains(String.valueOf(ch))) {
					continue;
				}
				rel = false;
			}

			System.out.println(rel ? "Love you too" : "We are only friends");
			System.out.println(x);
			x++;
			System.out.println(x);
		}

	}
}
