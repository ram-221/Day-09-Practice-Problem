package com.bridgelabday9;

public class ReverseNumber {

	public static void main(String args[]) {
		int number = 45678, reverse = 0,remainder;
		while(number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reversed Number: "+reverse);	
	}
}
