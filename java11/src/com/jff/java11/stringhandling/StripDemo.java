  package com.jff.java11.stringhandling;

public class StripDemo {

	public static void main(String[] args) {
		beforeJava11();
		fromJava11();
	}

	private static void beforeJava11() {

		System.out.println("Before Java 11F");

		String javaVersion = " Java 11 ";
		String strTrim = javaVersion.trim();

		System.out.println("Original String:" + javaVersion + ":");
		System.out.println("Trimmed String:" + strTrim + ":");

		// Can we remove space only from right or left
		// There is no specific method for that like ltrim to remove leading spaces
		// or rtrim for removing the trailing space

		System.out.println("Left Trimmed:" + javaVersion.replaceAll("^\\s+", "") + ":");

		System.out.println("Right Trimmed:" + javaVersion.replaceAll("\\s+$", "") + ":");

	}

	private static void fromJava11() {
		System.out.println("From Java 11F");
		String javaVersion = " Java 11 ";
		System.out.println("Original String:" + javaVersion + ":");
		String strStrip = javaVersion.strip();
		System.out.println("Stripped String:" + strStrip + ":");
		// if you want to trim trailing space
		String strStripTrailing = javaVersion.stripTrailing();
		System.out.println("Removed Trailing String:" + strStripTrailing + ":");

		// if you want to trim Leading space
		String strStripLeading = javaVersion.stripLeading();
		System.out.println("Removed Leading String:" + strStripLeading + ":");

	}

}
