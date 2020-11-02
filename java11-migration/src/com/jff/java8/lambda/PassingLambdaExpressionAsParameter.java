package com.jff.java8.lambda;

interface HelloInterface2 {
	public void displayHello();
}

public class PassingLambdaExpressionAsParameter {
	public static void main(String args[]) {
		
		HelloInterface2 helloInterface2 = () -> System.out.println("Hello");
		test(helloInterface2);
		
		//
		
		test2(() -> System.out.println("Hello"));
	}

	private static void test(HelloInterface2 helloInterface2) {

		System.out.println("From Test method");
		helloInterface2.displayHello();

	}
	private static void test2(HelloInterface2 helloInterface2) {

		System.out.println("From Test2 method");
		helloInterface2.displayHello();

	}
}
