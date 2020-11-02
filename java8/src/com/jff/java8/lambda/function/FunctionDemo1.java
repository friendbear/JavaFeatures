package com.jff.java8.lambda.function;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String args[]) {
		beforeJava8();//Without Function Functional Interface
		fromJava8();//With Function Functional Interface
	}

	private static void beforeJava8() {

		Integer n1 = 5;
		Integer squareOfNumber = calculateSquareOfNumber(n1);
		System.out.println("From withoutFunction - Square of a number is :" + squareOfNumber);

	}

	// User defined method, this functionality is common in most of the Java
	// application
	private static Integer calculateSquareOfNumber(Integer n1) {

		return n1 * n1;
		
	}

	private static void fromJava8() {

		Function<Integer, Integer> function = n1 -> n1 * n1;
		System.out.println("From withFunction - Square of a number is :" + function.apply(5));

		// Function<T, R>
		// @param <T> the type of the input to the function
		// @param <R> the type of the result of the function
	}

}
