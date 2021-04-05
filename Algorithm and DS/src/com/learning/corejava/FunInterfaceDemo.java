package com.learning.corejava;

import java.util.Arrays;

public class FunInterfaceDemo {

	public static void main(String[] args) {
		System.out.println("==================================================================");
		System.out.println("1. Method reference to an instance method of an object");
		FunInterface inter = new Test()::impl;
		inter.method(5);

		System.out.println("==================================================================");
		System.out.println("2. Method reference to a static method of a class");
		FunInterface inter2 = Test::stat;
		inter2.method(5);

		System.out.println("==================================================================");
		System.out
				.println("3. Method reference to an instance" + " method of an arbitrary object of a particular type");
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon" };
		/*
		 * Method reference to an instance method of an arbitrary object of a particular
		 * type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for (String str : stringArray) {
			System.out.println(str);
		}
		System.out.println("==================================================================");
	}

}

class Test {
	public void impl(int z) {
		System.out.println(z * z * z);
	}

	public static void stat(int z) {
		System.out.println((z + z) * z);
	}

}
