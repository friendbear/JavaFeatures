package com.jff.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class SystemOutWithDoubleColon {
	public static void main(String args[]) {

		withoutMethodRef();
		withMethodRef();

	}

	private static void withoutMethodRef() {
		System.out.println("From withoutMethodRef");
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (int i : intList) {
			System.out.println(i);
		}
	}

	private static void withMethodRef() {
		System.out.println("From withMethodRef!");
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		intList.forEach(System.out::println);
	}

}
