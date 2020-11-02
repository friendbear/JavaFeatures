package com.jff.java11.stringhandling;

public class StringIsBlankDemo {

	public static void main(String[] args) {
		beforeJava11();
		fromJava11();
	}

	private static void beforeJava11() {
		System.out.println("beforeJava11:");
		String str = "";
		//String str = " ";
		//Option#1
		if(str.length()==0 ) {
			System.out.println("String is blank");
		}else {
			System.out.println("String is not blank");
		}
		//Option #2
		if(str.equals("")) {
			System.out.println("String is blank");
		}else {
			System.out.println("String is not blank");
		}
		//Option #3
		
		if(str.isEmpty()){
			System.out.println("String is empty");
		}else{
			System.out.println("String is not empty");
		}
		
		
	}

	private static void fromJava11() {
		System.out.println("fromJava11:");
		String str = "";
		//String str = "  ";
		if(str.isBlank()) {
			System.out.println("String is blank");
		}else {
			System.out.println("String is not blank");
		}
	}

}
