package com.learning.corejava;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		System.out.println("==========================================================");
		Predicate<String> checklength = x-> x.length()>5;
		Predicate<String> checklengthEven = x-> x.length()%2 == 0;
		
		System.out.println(" Length of Mahendra  is greater then 5: " + checklength.test("Mahendrac"));
		
		System.out.println("Predicate Joining");
		System.out.println(" Length of Mahendra  is not greater then 5 : " + checklength.negate().test("Mahendrac"));
		System.out.println(" Length of Mahendra  is greater then 5 and Even : " + checklength.and(checklengthEven).test("Mahendrac"));
		System.out.println(" Length of Mahendra  is greater then 5 or Even : " + checklength.or(checklengthEven).test("Mahendrac"));
	
	}

}
