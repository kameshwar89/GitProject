package com.kamesh;

import java.util.Scanner;

public class RevPrime {
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	int i,j;
	public void print() {
			for(i=number-1; i>=2;i--) {
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
		// TODO Auto-generated method stub
		RevPrime object =new RevPrime();
		object.print();
	}
}
