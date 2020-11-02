package com.jff.java11.lambdaenhacement;

import javax.validation.constraints.Min;

// add validation-api-1.1.0.final.jar in class path

interface AddInterface1 {
	public int addTwoNumbers(int a, int b);

}

public class LambdaEnhancement {
	public static void main(String args[]) {
		beforeJava11();
		fromJava11();
	}
	private static void beforeJava11() {
		AddInterface1 addInterface1 = (  a, b) -> (a + b);
	
		int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("beforeJava11 - Sum of two Numbers: " + sum);

		
	}
	private static void fromJava11() {
		AddInterface1 addInterface1 = (  var a, var b) -> (a + b);
		//Change java compiler version to java 10 , you will get compilation error on the above line

		//AddInterface1 addInterface1 = (final  var a, final var b) -> (a + b);
		//AddInterface1 addInterface1 = (@Min(value = 10)  var a, @Min(value = 1) var b) -> (a + b);
		
		int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("fromJava11 - Sum of two Numbers: " + sum);
	}

	 



}
