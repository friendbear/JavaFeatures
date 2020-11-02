package com.jff.java8.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitDemo {

	public static void main(String args[]) {
		List<Integer> javaVersionList = new ArrayList<>();
		
		javaVersionList.add(8);
		javaVersionList.add(9);
		javaVersionList.add(12);
		javaVersionList.add(10);
		javaVersionList.add(7);
		javaVersionList.add(11);
		

	System.out.println("javaVersionList:"+javaVersionList);
	List<Integer> javaVersionSortedList = javaVersionList
		.stream()
		.sorted()
		.limit(3)
		.collect(Collectors.toList());
	
	System.out.println("javaVersionSortedList:"+javaVersionSortedList);
		

	}

}
