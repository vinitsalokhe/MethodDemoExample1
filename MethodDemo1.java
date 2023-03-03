package com.array.exercise;

public class MethodDemo1 {

	public static void main(String[] args) {

		MethodDemo1 d1 = new MethodDemo1();
		d1.addition(15, 15);

	}

	public void addition(int a, int b) {
		int result = 0;
		result = a + b;
		System.out.println(result);
	}
}
