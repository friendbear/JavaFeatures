package com.jff.java8.defaultmethod;

interface DefaultMethodDemo {
	public int addTwoNumber(int number1, int number2);
}

class ClassOne implements DefaultMethodDemo {
	public int addTwoNumber(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
}

class ClassTwo implements DefaultMethodDemo {
	public int addTwoNumber(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
}

class ClassThree implements DefaultMethodDemo {
	public int addTwoNumber(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
}

public class DefaultMethodDemoBeforeJava8 {

	public static void main(String args[]) {

		ClassOne classOne = new ClassOne();
		int sum = classOne.addTwoNumber(100, 200);
		System.out.println("Total of two numbers are: " + sum);

	}
}
