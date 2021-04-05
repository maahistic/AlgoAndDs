package com.learning.corejava;

public class DataFlow {

	public static void main(String[] args) {

		son ss = new son();
		System.out.println("=================================");
		DataFlow ds = new Child();
		System.out.println("=================================");
		DataFlow dd = new DataFlow();
		System.out.println("=================================");
		/* son sd = new dad(); - not possible in Java */
		System.out.println("=================================");
		new Child();
		System.out.println("=================================");
		System.out.println("Static block is only created once per class");

		ss.method();
		ss.method("just a parameter");
	}

	{
		System.out.println("dad block");
	}

	static {
		System.out.println("dad static");
	}

	DataFlow() {
		System.out.println("dad Const");
	}

	void method(String name) {
		System.out.println("dad method");
	}

}

class Child extends DataFlow {

	void method() {
		System.out.println("son method");
	}

	{
		System.out.println("son block");
	}

	static {
		System.out.println("son static");
	}

	Child() {
		System.out.println("son Const");
	}

}