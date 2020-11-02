package com.jff.java8.lambda;

class RunnableImple implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("From Run method");
			
		}
	}
}

public class ThreadWithoutLambda {
	public static void main(String args[]) throws InterruptedException {
		Runnable runnable = new RunnableImple();
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("From Main method");			
		}
	}
}
