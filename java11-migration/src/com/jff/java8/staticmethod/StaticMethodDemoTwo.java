package com.jff.java8.staticmethod;

interface StaticMethodInterface {
	static public void myUtilityMethod() {
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

public class StaticMethodDemoTwo implements StaticMethodInterface {

	
	public static void main(String args[]) {
		StaticMethodInterface.myUtilityMethod();
	}
	
	
	
	
	//Note we can't override interface static method.
	
/*	@Override
	public void myUtilityMethod() {
		
	}*/
}
