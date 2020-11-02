package com.jff.java7;

public class StringInSwitchDemo {
	final String JAVA7 = "Java 7";
	final String JAVA8 = "Java 8";
	final String JAVA9 = "Java 9";
	final String JAVA10 = "Java 10";
	final String JAVA11 = "Java 11";

	public static void main(String[] args) {
		StringInSwitchDemo stringInSwitchDemo = new StringInSwitchDemo();
		stringInSwitchDemo.beforeJava7("Java 7");
		stringInSwitchDemo.fromJava7("Java 7");
	}

	private void beforeJava7(String param) {
		System.out.println("BeforeJava7:");
		if (param.equals(JAVA7)) {
			System.out.println("Java version: " + JAVA7);
		} else if (param.equals(JAVA8)) {
			System.out.println("Java version: " + JAVA8);
		} else if (param.equals(JAVA9)) {
			System.out.println("Java version: " + JAVA9);
		} else if (param.equals(JAVA10)) {
			System.out.println("Java version: " + JAVA10);
		} else if (param.equals(JAVA11)) {
			System.out.println("Java version: " + JAVA11);
		} else {
			System.out.println("Very old version of Java");
		}

		
	}

	private void fromJava7(String param) {
		System.out.println("FromJava7");
		switch (param) {
		case JAVA7:
			System.out.println("Java version: " + JAVA7);
			break;
		case JAVA8:
			System.out.println("Java version: " + JAVA8);
			break;
		case JAVA9:
			System.out.println("Java version: " + JAVA9);
			break;
		case JAVA10:
			System.out.println("Java version: " + JAVA10);
			break;
		case JAVA11:
			System.out.println("Java version: " + JAVA11);
			break;
		default:
			System.out.println("Java old version: ");
		}

	

	}

}
