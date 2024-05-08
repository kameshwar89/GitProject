package com.kamesh;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int a , b=0;
		int ref = number;
		
		while(number>0)
		{
			a=number%10;
			b=(a*a*a)+b;
			number=number/10;
		}
		if(ref == b)
		{
			System.out.println("This is Amstrong number");
		}
		else {
			System.out.println("Not a amstrong");
		}

	}

}
