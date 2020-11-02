package com.jff.java9.collections;

import java.util.HashSet;
import java.util.Set;

public class FactoryMethodSetDemo {

	public static void main(String[] args) {

		beforeJava9();
		fromJava9();

	}

	private static void beforeJava9() {
		Set<String> javaVersions = new HashSet<>();
		javaVersions.add("Java7");
		javaVersions.add("Java8");
		javaVersions.add("Java9");
		System.out.println("set of Java Versions" + javaVersions);
		// Modify javaVersions

		javaVersions.add("Java10");
		javaVersions.add("Java11");

		System.out.println("After Modification, set of Java Versions" + javaVersions);

	}

	private static void fromJava9() {
		System.out.println("From Java 9");
		Set<String> javaVersions9 = Set.of("Java7", "Java8", "Java9");
		System.out.println("set of Java version" + javaVersions9);

		javaVersions9.add("Java10");//Exception java.lang.UnsupportedOperationException

		System.out.println("After Modification, set of Java Versions" + javaVersions9);

	}

}
