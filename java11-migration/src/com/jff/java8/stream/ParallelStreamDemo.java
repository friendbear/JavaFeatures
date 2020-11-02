package com.jff.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo {

	public static void main(String args[]) {
		List<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < 99999; i++) {
			numberList.add(i);
		}
		//stream(numberList);//Time taken by Stream : 270
		parallelStream(numberList);//Time taken by Parallel Stream : 233

	}

	private static void stream(List<Integer> numberList) {

		long startTime = System.currentTimeMillis();
		System.out.println(
				"####Stream evenList : " + numberList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

		long stopTime = System.currentTimeMillis();
		long executionTime = stopTime - startTime;
		System.out.println("####Time taken by Stream : "+ executionTime);
		

	}

	private static void parallelStream(List<Integer> numberList) {
		long startTime = System.currentTimeMillis();
		System.out.println("parallelStream evenList : "
				+ numberList.parallelStream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
		long stopTime = System.currentTimeMillis();
		long executionTime = stopTime - startTime;
		System.out.println("Time taken by Parallel Stream : "+ executionTime);


	}

}
