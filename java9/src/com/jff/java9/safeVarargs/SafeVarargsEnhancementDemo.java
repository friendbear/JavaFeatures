package com.jff.java9.safeVarargs;

import java.util.List;

public class SafeVarargsEnhancementDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
/*		add(a, b);
		add(a, b, c);
		add(a, b, c, d);*/

	}

	/*private static void add(int a, int b) {
		int total = a + b;
		System.out.println("Total :" + total);

	}

	private static void add(int a, int b, int c) {

		int total = a + b + c;
		System.out.println("Total :" + total);

	}

	private static void add(int a, int b, int c, int d) {

		int total = a + b + c + d;
		System.out.println("Total :" + total);

	}*/
	
	private static void add(List<String> ... i) {
		int total = 0;
	/*	for (int x : i) {
			total = total + x;			
		}	*/	
		System.out.println("Total :" + total);
	}


}
