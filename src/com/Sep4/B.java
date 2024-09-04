package com.Sep4;

public class B {
	public static void main(String[] args) {
		System.out.println(1 / 4);
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Infinity");
		}
	}

}
