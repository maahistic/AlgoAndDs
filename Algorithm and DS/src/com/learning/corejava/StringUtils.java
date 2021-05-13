package com.learning.corejava;

public class StringUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "1234567890";
		System.out.println(new StringBuilder(str).insert(6, " - ").insert(3, ") ").insert(0, "("));
	}

}
