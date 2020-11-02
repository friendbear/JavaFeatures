package com.jff.java8.methodreference;


public class ThreadWithMethodReference {
	public static void main(String args[]) throws InterruptedException {
		Runnable runnable = Test::test;
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("From Main method");			
		}
	}
}

class Test  {
	public static void test() {
		for (int i = 0; i < 10; i++) {
			System.out.println("From test method ");			
		}
	}	
}
