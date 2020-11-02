package com.jff.java11.stringhandling;

import java.util.stream.Stream;

public class StringsLinesDemo {

	public static void main(String[] args) {
		beforeJava11();
		fromJava11();
	}

	private static void beforeJava11() {
		System.out.println("Before Java 11");
		String str = "Java11\nJava10\nJava9\nJava8";
		String lines[] = str.split("\\n");
		for (String s : lines) {
			System.out.println(s);
		}

	}

	private static void fromJava11() {
		System.out.println("From Java 11");
		String str = "Java11\nJava10\nJava9\nJava8";
		System.out.println(str.lines());
		
		final Stream<String> strings = str.lines();
		strings.forEach(System.out::println);

	}

}
