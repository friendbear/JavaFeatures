package com.jff.java8.lambda;

interface HelloInterface {
	public void displayHello();
}

class HelloInterfaceImple implements HelloInterface {
	@Override
	public void displayHello() {
		System.out.println("Hello");
	}
}

public class HelloWithoutLambda {
	public static void main(String args[]) {
		HelloInterface helloInterface = new HelloInterfaceImple();
		helloInterface.displayHello();
	}
}
