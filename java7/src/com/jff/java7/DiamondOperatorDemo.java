package com.jff.java7;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorDemo {

	public static void main(String[] args) {
		beforeJava7();
		fromJava7();
	}

	private static void beforeJava7() {
		System.out.println("BeforeJava7:");

		List<String> javaVersionlist = new ArrayList<String>();

		javaVersionlist.add("java 7");
		javaVersionlist.add("java 8");
		javaVersionlist.add("java 9");
		javaVersionlist.add("java 10");
		javaVersionlist.add("java 11");
		System.out.println("List of java versions :" + javaVersionlist);

	}

	private static void fromJava7() {

		System.out.println("FromJava7:");
		List<String> javaVersionlist = new ArrayList<>();

		javaVersionlist.add("java 7");
		javaVersionlist.add("java 8");
		javaVersionlist.add("java 9");
		javaVersionlist.add("java 10");
		javaVersionlist.add("java 11");
		System.out.println("List of java versions :" + javaVersionlist);

	}

}
