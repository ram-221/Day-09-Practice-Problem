package com.bridgelabday9;

public class FactorOfANumber {

	 public static void main(String[] args) {

	      int number = 24,i;
	     System.out.println( "Factors of " + number + " are " );
	     for(i = 1; i <= number; i++)
	     {
	         if(number % i == 0)
	             System.out.println(i + " "); 
	     }
	 }
}
