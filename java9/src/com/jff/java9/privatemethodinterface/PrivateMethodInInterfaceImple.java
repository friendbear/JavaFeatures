package com.jff.java9.privatemethodinterface;

import java.util.Random;

interface BeforeJava9 {

	static void displayRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(50000);
		System.out.println("Randon Number :" + randomNumber);
	};

	static void AppendRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(50000);
		String appendCode = "ABC" + randomNumber;
		System.out.println("Randon Number after apending :" + appendCode);
	};
}

interface FromJava9 {

	static void displayRandomNumber() {
		System.out.println("Randon Number :" + generateRandomNumber());
	};

	static void AppendRandomNumber() {
		String appendCode = "ABC" + generateRandomNumber();
		System.out.println("Randon Number after apending :" + appendCode);
	};

	private static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(50000);
	};
}

public class PrivateMethodInInterfaceImple implements BeforeJava9, FromJava9 {

	public static void main(String[] args) {

		BeforeJava9.displayRandomNumber();
		BeforeJava9.AppendRandomNumber();

		FromJava9.displayRandomNumber();
		FromJava9.AppendRandomNumber();
	}

}
