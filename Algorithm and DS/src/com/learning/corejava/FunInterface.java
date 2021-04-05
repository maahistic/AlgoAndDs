package com.learning.corejava;

@FunctionalInterface
public interface FunInterface {
	
	void method(int a);
	 
	default void printName()
	{
		System.out.println("This is first method");
	}
	
	default void printName2()
	{
		System.out.println("This is second method");
	}
	

}
