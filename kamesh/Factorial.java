package com.kamesh;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int fact = 1;
		for(int i =1 ; i <= value; i++)
		{
			fact *= i; 
		}
		System.out.println(fact);
	}

}