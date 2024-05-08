package com.kamesh;

import java.util.Scanner;

public class OddorEven1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i=1;i<=number;i++) {
		
		if(i%2==0) {
			System.out.println(i);
		}
//		else {
//			System.out.println("odd");
//		}
		}
	}

}
