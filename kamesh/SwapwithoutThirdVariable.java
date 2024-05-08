package com.kamesh;

import java.util.Scanner;

public class SwapwithoutThirdVariable {

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	public void swap() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of "+a+"the value of "+b);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapwithoutThirdVariable swapwithoutThirdVariable=new SwapwithoutThirdVariable();
		swapwithoutThirdVariable.swap();
		
	}

}
