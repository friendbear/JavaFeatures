package com.jff.java9.collections;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodListDemo {

	public static void main(String[] args) {
		beforeJava9();
		fromJava9();

	}

	private static void beforeJava9() {
		List<String> javaVersions = new ArrayList<>();
		javaVersions.add("Java7");
		javaVersions.add("Java8");
		javaVersions.add("Java9");
		System.out.println("List of Java Versions" + javaVersions);
		// Modify javaVersions

		javaVersions.add("Java10");
		javaVersions.add("Java11");
		System.out.println("After Modification, list of Java Versions" + javaVersions);

	}

	private static void fromJava9() {

		System.out.println("From Java 9");
		List<String> javaVersions9 = List.of("Java7", "Java8", "Java9");
		System.out.println("List of Java version" + javaVersions9);
		javaVersions9.add("Java10");// Exception java.lang.UnsupportedOperationException

		System.out.println("After Modification, list of Java Versions" + javaVersions9);

	}

}
