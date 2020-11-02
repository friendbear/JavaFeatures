package com.jff.java8.stream;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParalelStreamDemo {
	
	private static void sequentialStream() {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 70000; i++) {
			intList.add(i);
		}
		Predicate<Integer> evenPredicate = (a -> a % 2 == 0);
		List<Integer> evenList =
				intList
				.stream()
				.filter(evenPredicate)
				.collect(Collectors.toList());
	}

	private static void paralelStream() {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 70000; i++) {
			intList.add(i);
		}
		Predicate<Integer> evenPredicate = (a -> a % 2 == 0);
		List<Integer> evenList =
				intList
				.parallelStream()
				.filter(evenPredicate)
				.collect(Collectors.toList());
	
	}
	public static void main(String args[]) {
		Instant startTime = Instant.now();
		//long startTimeBeforeJava8 = System.currentTimeMillis();
		sequentialStream();
		Instant endTime = Instant.now();
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Sequential Stream Duration: " + duration.toMillis());

		
		Instant paralelStartTime = Instant.now();
		
		paralelStream();
		Instant paralelEndTime = Instant.now();
		Duration paralelDuration = Duration.between(paralelStartTime, paralelEndTime);
		System.out.println("Paralel Stream Duration: " + paralelDuration.toMillis());

	}

}
