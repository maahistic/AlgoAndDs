package com.learning.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamDemoConfig {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(12);
		list.add(34);
		list.add(4);
		list.add(33);
		list.add(77);

		System.out.println("==============Stream Example with Configuration==================");
		// Configuring the Streams.
		Stream<Integer> str = list.stream().filter(i -> i % 2 == 0);
		// Collect Configuration
		System.out.println("===========Collect Config==============");
		List<Integer> filtered = str.collect(Collectors.toList());
		filtered.stream().forEach(i -> System.out.println(i));
		System.out.println("===========Count Config==============");
		System.out.println(filtered.stream().count());
		System.out.println("===========Natural Sorted Config==============");
		list.stream().sorted().forEach(i -> System.out.println(i));
		System.out.println("===========Desc Sorted Config=============");
		list.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(i -> System.out.println(i));
		System.out.println("===========find Min ==============");
		System.out.println(list.stream().min((i1, i2) -> i1.compareTo(i2)));
		System.out.println("===========find max ==============");
		System.out.println(list.stream().max((i1, i2) -> i1.compareTo(i2)));
		System.out.println("===========for each ==============");
		list.stream().forEach(i-> System.out.println(i));
		System.out.println("===========Convert it into Array ==============\n");
		//Convert Stream into Array
		Object[] arr = list.stream().toArray();
		
		System.out.println("================= of ===========================");
		Stream.of("Mahi","Banna","MD","Sonal","Nadi").filter(x-> x.charAt(0)=='M').forEach(p->System.out.println(p));
	}
	
}
