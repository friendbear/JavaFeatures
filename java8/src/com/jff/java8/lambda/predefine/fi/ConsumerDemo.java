package com.jff.java8.lambda.predefine.fi;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String args[]) {
		beforeJava8();
		fromJava8();

	}

	private static void beforeJava8() {

		dispalyInUpperCase("Java Fast Forward");
	}

	private static void dispalyInUpperCase(String str) {
		System.out.println(str.toUpperCase());

	}

	private static void fromJava8() {
		Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
		consumer.accept("Java Fast Forward");

	}

}









