package com.jff.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	static List<Integer> intList = Arrays.asList(4, 9, 16, 25, 36, 49, 64, 81, 100);

	public static void main(String args[]) {

		List<Integer> squareList = intList.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("squareList: " + squareList);
	}

}
