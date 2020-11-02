package com.jff.java8.lambda.predefine.fi;

import java.util.function.Supplier;

public class SuplierDemo {
	public static void main(String args[]) {
		beforeJava8();
		fromJava8();

	}

	private static void beforeJava8() {

		double inrRate = getINRRate();
		System.out.println("beforeJava8 :INR rate is " + inrRate);
	}

	public static double getINRRate() {

		double inrRate = 71.0; // call web service
		return inrRate;

	}

	private static void fromJava8() {
		double inrRate = 71.0;// Call webservice
		Supplier<Double> supplier = () -> inrRate;
		System.out.println("fromJava8 :INR rate is " + supplier.get());

	}

}
