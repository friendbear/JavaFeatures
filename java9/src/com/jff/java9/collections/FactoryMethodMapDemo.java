package com.jff.java9.collections;

import java.util.HashMap;
import java.util.Map;

public class FactoryMethodMapDemo {

	public static void main(String[] args) {
		beforeJava9();
		fromJava9();

	}

	private static void beforeJava9() {
		Map<Integer, String> javaVersions = new HashMap<>();
		javaVersions.put(7, "Java7");
		javaVersions.put(8, "Java8");
		javaVersions.put(9, "Java9");
		System.out.println("map of Java Versions" + javaVersions);
		// Modify javaVersions

		javaVersions.put(10, "Java10");
		javaVersions.put(11, "Java11");

		System.out.println("After Modification, map of Java Versions" + javaVersions);

	}

	private static void fromJava9() {
		System.out.println("From Java 9");
		Map<Integer, String> javaVersions9 = Map.of(7, "Java7", 8, "Java8", 9, "Java9");
		System.out.println("Map of Java version" + javaVersions9);

		javaVersions9.put(10, "Java10");//Exception java.lang.UnsupportedOperationException


		System.out.println("After Modification, map of Java Versions" + javaVersions9);

	}

}
