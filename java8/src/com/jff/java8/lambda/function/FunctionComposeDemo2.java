package com.jff.java8.lambda.function;

import java.util.function.Function;

public class FunctionComposeDemo2 {
	public static void main(String args[]) {

		Function<Integer, Integer> function1 = n1 -> n1 + n1;
		Function<Integer, Integer> function2 = n1 -> n1 * n1;

		System.out.println("Function 1 compose Function 2 : " + function1.compose(function2).apply(10));

	}

}
