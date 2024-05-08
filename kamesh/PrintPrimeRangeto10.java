package com.kamesh;

import java.util.Scanner;

public class PrintPrimeRangeto10 {
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int i,j;
	public void primeOrNot() {
		for(i=2; i<=number-1;i++) {
			int flag = 0;
			for(j=2; j<i;j++) {
				if(i%j ==0) {
					flag=1;
					break;
				}
			}
		if(flag == 0 ) {
			System.out.println(i);
		}
			
		}
	}
	public static void main(String[] args) {
		PrintPrimeRangeto10 obj= new PrintPrimeRangeto10();
		obj.primeOrNot();

	}

}
