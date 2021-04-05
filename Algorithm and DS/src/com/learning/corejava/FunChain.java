package com.learning.corejava;

import java.util.function.Function;

public class FunChain {

	public static void main(String[] args) {
		
		System.out.println("==============Funtion Chaining ==========================");
		
		Function<Integer,Integer> dob = x-> x+x;
		Function<Integer,Integer> sqr = x-> x*x;
		
		System.out.println("===============and then ======================");
		System.out.println("bouble 3 then square it : " + dob.andThen(sqr).apply(4));
		System.out.println("===============compose ======================");
		System.out.println("square 3 then Double it : " + dob.compose(sqr).apply(4));
		System.out.println("=====================================");
		
	}

}
