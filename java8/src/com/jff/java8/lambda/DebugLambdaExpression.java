package com.jff.java8.lambda;

interface DebugLambdaInteface {
	public int sumOfTwoNumbers(int a, int b);
}

public class DebugLambdaExpression {

	public static void main(String args[]) {
		System.out.println("Start Main");
		DebugLambdaInteface debugLambda = (a, b) -> {
			System.out.println("Inside Lambda Expression");
			int sum = a + b;
			return sum;
		};

		System.out.println("before calling  addTwoNumbers method");
		addTwoNumbers(debugLambda);
		System.out.println("after calling  addTwoNumbers method");
		System.out.println("End Main");

	}

	private static void addTwoNumbers(DebugLambdaInteface debugLambda) {
		System.out.println("Start addTwoNumbers");
		System.out.println("Sum of two numbers" + debugLambda.sumOfTwoNumbers(100, 200));
		System.out.println("End addTwoNumbers");
	}

}