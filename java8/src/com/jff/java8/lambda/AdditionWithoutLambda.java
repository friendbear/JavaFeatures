package com.jff.java8.lambda;

interface AddInterface {
	public int addTwoNumbers(int a, int b);

}

class AddInterfaceImple implements AddInterface {
	@Override
	public int addTwoNumbers(int a, int b) {

		return a + b;
	}
}

public class AdditionWithoutLambda {
	public static void main(String args[]) {
		AddInterface addInterface = new AddInterfaceImple();
		addInterface.addTwoNumbers(100, 200);

	}
}
