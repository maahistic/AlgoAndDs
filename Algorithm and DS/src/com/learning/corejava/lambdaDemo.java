package com.learning.corejava;

public class lambdaDemo {

	public static void main(String[] args) {

		System.out.println("============================Lambda Expression======================");
		FunInterface inter = x -> System.out.println(x*x);
		inter.method(3);
		
	}
	
}
