package com.learning.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class InfyAss4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			s.nextInt();
			int occ = s.nextInt();
			s.nextLine();
			String str = s.nextLine();
			for (String st : str.split("")) {
				if (!map.containsKey(st)) {
					map.put(st, 1);
					System.out.print(st);
				} else if (map.get(st) < occ) {
					System.out.print(st);
					map.put(st, map.get(st)+1);
				}
			}
			map.clear();
			System.out.println();
		}

	}

}
