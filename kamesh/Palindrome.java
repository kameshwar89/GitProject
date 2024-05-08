package com.kamesh;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a,b=0;
		int value = n;
		while(n>0)
		{
			a = n%10;
			b = (b*10)+a;
			n = n/10;
		}
		
		if(value==b)
		{
			System.out.println("its a Palindrome");
			
		}
		else
		{
			System.out.println("its not a Palindrome");
		}
	}

}
