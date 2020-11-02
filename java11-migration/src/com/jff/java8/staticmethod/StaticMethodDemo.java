package com.jff.java8.staticmethod;

interface StaticMethod {
	static public void myUtilityMethod1() {
		System.out.println("This a utility method1");
	}
	static public void myUtilityMethod2() {
		System.out.println("This a utility method2");
		//A static method can't access non static method
		//Please uncomment the below code and check the compilation error
		//test();
	}
	default public void test() {
		System.out.println("This a utility method2");
	}
}

public class StaticMethodDemo implements StaticMethod {
	
	public static void main(String args[]) {
		StaticMethod.myUtilityMethod1();
	}
	//Note we can't override interface static method.
	//Please uncomment the below code and see the compilation error
/*	@Override
	public void myUtilityMethod2() {
		
	}*/
}
