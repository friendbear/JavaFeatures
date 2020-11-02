package com.jff.java8.lambda;


interface HelloInterface1 {
	public void displayHello();	
}

public class HelloWithLambda {
public static void main(String args[]) {
	HelloInterface1 helloInterface1 = () -> System.out.println("Hello");
	helloInterface1.displayHello();
}
}
