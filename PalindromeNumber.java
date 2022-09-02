package com.bridgelabday9;

public class PalindromeNumber {

	public static void main(String args[]) {
		int number = 121, reverseNum = 0, remainder;
		int fixNumber = number;
		while(number != 0) {
			remainder = number % 10;
			reverseNum = reverseNum * 10 + remainder;
		}
		if(fixNumber == reverseNum) {
			System.out.println(reverseNum +" is Palindrome");
		}
		else {
			System.out.println(reverseNum+" is not Pl=alindrome");
		}
	}
}
