
package com.kamesh;
import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number \n");
		int number = sc.nextInt();
		int i ;
		int flag = 0;
		if(number == 0 || number == 1)
			flag = 1;
		for(i=2;i<=number-1;i++)
		{
			if(number%i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(number + " is a prime");
		}
		else
		{
			System.out.println( " not  a prime");
		}

	}

	
}
