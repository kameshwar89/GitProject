package com.kamesh;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		//String reverse = "";
//		for(int i =0; i<value.length()-1; i++)
//		{
//			char nul = value.charAt(i);
//			reverse = nul + reverse;
//			
//			
//		}
//		System.out.println(reverse);
		for(int i=value.length()-1;i>=0;i--) {
			System.out.print(value.charAt(i));
		}

	}

}
