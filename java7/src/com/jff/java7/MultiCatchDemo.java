package com.jff.java7;

public class MultiCatchDemo {
	static int myArray[] = new int[5];

	public static void main(String[] args) {
		beforeJava7();
		fromJava7();
	}

	private static void beforeJava7() {
		System.out.println("beforeJava7:");
		try {
			int result = 100 / 0;
			System.out.println("result : " + result);
			System.out.println(myArray[10]);

		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	private static void fromJava7() {
		System.out.println("fromJava7:");
		try {
			int result = 100 / 0;
			System.out.println("result : " + result);
			System.out.println(myArray[10]);

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
