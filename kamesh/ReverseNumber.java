package com.kamesh;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,n;
		Scanner input = new Scanner(System.in);
		n  = input.nextInt();
		while(n>0)
		{
			a=n%10;
			b=(b*10)+a;
			n = n/10;
			
		}
		System.out.println(b);

	}

}
