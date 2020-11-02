package com.jff.java8.methodreference;

class Hello{
	Hello() {
		System.out.println("Hello");
	}
}

interface HelloInterface5 {
	public Hello displayHello();	
}

public class MethodReferenceConstructorDemo {
	public static void main(String args[]) {
		
		HelloInterface5 helloInterface = Hello::new;
		Hello hello = helloInterface.displayHello();		
	}
}
