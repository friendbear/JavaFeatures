package com.jff.java8.functionalinterface;

@FunctionalInterface
interface MyInterface {
	public void method1();
}

//@FunctionalInterface
interface MyInterface2 {
	public void method1();
	// A Functional Interface can't have more than 1 abstract method
	// Please uncomment the below code and check the compilation error
	 public void method2();
}

@FunctionalInterface
interface DefaultInterface {
	public void method1();

	// Note:Functional Interface can have default methods

	default public void method2() {
		System.out.println("From method2 ");
	}

	default public void method3() {
		System.out.println("From method2 ");
	}
}

@FunctionalInterface
interface StaticInterface {
	public void method1();

	// Note:Functional Interface can have static methods

	static public void method2() {
		System.out.println("From method2 ");
	}

	static public void method3() {
		System.out.println("From method2 ");
	}
}

@FunctionalInterface
interface EqualInterface {
	public void method1();

	// Note:Functional Interface can have methods of java.lang.Object

	public boolean equals(Object obj);
}

public class FunctionalInterfaceDemo implements MyInterface {

	public static void main(String args[]) {
		FunctionalInterfaceDemo obj = new FunctionalInterfaceDemo();
		obj.method1();
	}

	@Override
	public void method1() {
		System.out.println("Overriding Method1");

	}
}
