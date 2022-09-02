package com.bridgelabday9;

public class PowerOfNumber {

	public static void main(String args[]) {
		int base = 5, exponent = 3, result = 1;
		while(exponent != 0) {
			result *= base;
			--exponent;
		}
		System.out.println("result: "+result);
	}
}
