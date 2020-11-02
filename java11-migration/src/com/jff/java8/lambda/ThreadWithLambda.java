package com.jff.java8.lambda;


public class ThreadWithLambda {
	public static void main(String args[]) throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("From Run method ");
				
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("From Main method");			
		}
	}
}
