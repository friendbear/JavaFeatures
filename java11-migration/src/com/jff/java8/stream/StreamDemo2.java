package com.jff.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
	static List<String> listOfCities = Arrays.asList("Hyderabad","Chennai","Banglore","Chicago", "Hamburg","Mumbai","Hampton", "Singapore", "Honkong");

	public static void main(String args[]) {

		beforeJava8();
		fromJava8();

	}
	private static void beforeJava8() {
		List<String> cityHList = new ArrayList<>();
		for (String city : listOfCities) {
			if (city.startsWith("C")) {
				cityHList.add(city);
			}
		}
		System.out.println("beforeJava8 cityList : " + cityHList);
	}

	private static void fromJava8() {
		System.out.println("fromJava8 cityList : " + listOfCities.stream().filter(city -> city.startsWith("C")).collect(Collectors.toList()));
	}

}
