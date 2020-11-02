package com.jff.java8.lambda.function;

import java.util.function.Function;

public class FunctionComposeDemo1 {
	public static void main(String args[]) {

		Function<String, String> function1 = s -> s.toUpperCase();
		Function<String, String> function2 = s -> s + " World";

		System.out.println("Output - function1 : " + function1.apply("Hello"));

		System.out.println("Output - Compose : " + function1.compose(function2).apply("Hello"));
		//The output of the first function will become input to the second function 


	}

}
