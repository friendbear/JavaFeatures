package com.jff.java8.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String args[]) {

		List<String> javaVersionList = new ArrayList<>();
		javaVersionList.add("Java 7");
		javaVersionList.add("Java 8");
		javaVersionList.add("Java 9");
		javaVersionList.add("Java 10");
		javaVersionList.add("Java 11");
		javaVersionList.add("Java 12");
		
		System.out.println(" javaVersionList  \\t    : " + javaVersionList);

		List<String> javaVersionUpperCaseList = javaVersionList.stream().map(javaVersion -> javaVersion.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("javaVersionUpperCaseList: " + javaVersionUpperCaseList);
	}

}
