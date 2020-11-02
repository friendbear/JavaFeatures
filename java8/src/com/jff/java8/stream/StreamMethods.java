package com.jff.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	static List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

	public static void main(String args[]) {
		streamMap();
		streamFlatMap();
		streamIterate();
	}

	public static void streamMap() {
		List<Integer> squareList = intList.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("squareList: " + squareList);

	}

	public static void streamFlatMap() {
		List<Integer> squareList = intList.stream().flatMap(i -> Stream.of(i * i, i + i)).collect(Collectors.toList());
		System.out.println("squareList: " + squareList);

	}

	public static void streamIterate() {

		// Stream.iterate(1, i -> i + i).forEach(System.out::println);
		Stream.iterate(1, i -> i + i).limit(10).forEach(System.out::println);

	}

}
