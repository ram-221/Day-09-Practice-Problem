package com.bridgelabday9;
import java.util.Scanner;


public class ArmstrongNumberRange {

	public static void main(String args[])
    {
	int number, start, end, temp, counter=0;
		
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the start number: ");
	start = s.nextInt();
	System.out.print("Enter the end number: ");
	end = s.nextInt();
	s.close();

	for(int i=start+1; i<end; i++)
	{
	   temp = i;
	   number = 0;
	   while(temp != 0)
	   {
		int rem = temp%10;
		number = number + rem*rem*rem;
		temp = temp/10;
	   }
	   if(i == number)
	   {
		if(counter == 0)
		{
		   System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
		}
		   System.out.print(i + "  ");
		   counter++;
	   }
	}
	if(counter == 0)
	{
	   System.out.print("There is no Armstrong number Between "+start+" and "+end);
	}
  }

}
