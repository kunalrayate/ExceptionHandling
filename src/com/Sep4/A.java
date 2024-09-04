package com.Sep4;

public class A {
	public static void main(String[] args) {
		System.out.println(10 / 2);
		System.out.println(2 / 1);
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Infinity");
			System.out.println(3 / 1);
			System.out.println(4 / 1);
		}
	}
}
