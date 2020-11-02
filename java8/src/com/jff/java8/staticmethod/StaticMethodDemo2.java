package com.jff.java8.staticmethod;

interface StaticMethod2 {

	static public void myUtilityMethod2() {
		System.out.println("This a utility method2");

		// A static method can't access non static method
		// Please uncomment the below code and check the compilation error
		// test();
	}

	default public void test() {
		System.out.println("This a utility method2");
	}
}

public class StaticMethodDemo2 implements StaticMethod2 {

	public static void main(String args[]) {
		StaticMethod2.myUtilityMethod2();
	}
	// Note we can't override interface static method.
	// Please uncomment the below code and see the compilation error
	/*
	 * @Override public void myUtilityMethod2() {
	 * 
	 * }
	 */
}
