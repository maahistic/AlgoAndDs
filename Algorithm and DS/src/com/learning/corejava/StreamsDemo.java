package com.learning.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
//		list.add(45);
//		list.add(12);
//		list.add(34);
//		list.add(4);
//		list.add(33);
//		list.add(77);
		
		list = Arrays.asList(45,12,34,4,33,77);

		System.out.println("==============Stream Example with filter");
		System.out.println("==============Stream Example where elements ware divisiable by 2 ");

		//Configuring the Streams.
		Stream<Integer> str = list.stream().filter(i -> i % 2 == 0);
		
		//Processing the Streams.
		str.forEach(i -> System.out.println(i));
		System.out.println("==============same implementation with one liner Code============ ");
		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

		System.out.println("==============Stream Example with Map=======================");
		list.stream().map(i -> i+i).forEach(i -> System.out.println(i));
	}

}
