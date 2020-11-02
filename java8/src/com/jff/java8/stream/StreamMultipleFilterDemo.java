package com.jff.java8.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMultipleFilterDemo {

	public static void main(String args[]) {
		List<Integer> javaVersionList = new ArrayList<>();
		javaVersionList.add(7);
		javaVersionList.add(8);
		javaVersionList.add(9);
		javaVersionList.add(10);
		javaVersionList.add(11);
		javaVersionList.add(12);

		beforeJava8(javaVersionList);
		fromJava8(javaVersionList);

	}

	private static void beforeJava8(List<Integer> javaVersionList) {

		List<Integer> evenList = new ArrayList<>();
		for (Integer javaVersion : javaVersionList) {
			if (javaVersion % 2 == 0) {

				evenList.add(javaVersion);
			}

		}

		System.out.println("beforeJava8 Java version even  list" + evenList);

	}

	private static void fromJava8(List<Integer> javaVersionList) {

		Predicate<Integer> evenVersion = (javaVersion -> javaVersion % 2 == 0);
		Predicate<Integer> greaterThan8Version = (javaVersion -> javaVersion > 8);

		List<Integer> evenJavaVersionList = 
				javaVersionList.stream()
				.filter(evenVersion)
				.collect(Collectors.toList());

		System.out.println("fromJava8 evenJavaVersionList : " + evenJavaVersionList);
		
		
		List<Integer> finalJavaVersionList = 
				javaVersionList.stream()
				.filter(evenVersion)
				.filter(greaterThan8Version)
				.collect(Collectors.toList());

		System.out.println("fromJava8 finalJavaVersionList : " + finalJavaVersionList);

	}

}
