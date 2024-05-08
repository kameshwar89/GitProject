package com.kamesh;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of array input");
		
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int[] desc = new int[10];
		
		for(int i =0; i<n; i++)
		{
			desc[i]= input.nextInt();
		}
		
		for(int i =0; i<n; i++)
		{
			System.out.println(desc[i]);
		}
	}

}
