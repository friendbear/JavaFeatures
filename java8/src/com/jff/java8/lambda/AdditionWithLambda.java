package com.jff.java8.lambda;

interface AddInterface1 {
	public int addTwoNumbers(int a, int b);

}

public class AdditionWithLambda {
	public static void main(String args[]) {
		AddInterface1 addInterface1 = (a, b) -> (a + b);
		AddInterface1 addInterface2 = (a, b) -> {
			return (a + b);
		};
		int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("Sum of two Numbers: " + sum);
	}
}
