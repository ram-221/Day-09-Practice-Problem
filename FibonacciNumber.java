package com.bridgelabday9;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int firstTerm = 0, secondTerm = 1;

		System.out.println("Fibonacci Series Upto " + number + ": ");

		while (firstTerm <= number) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}
	}
}
