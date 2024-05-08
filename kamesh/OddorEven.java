package com.kamesh;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if(number%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
			
	}

}
