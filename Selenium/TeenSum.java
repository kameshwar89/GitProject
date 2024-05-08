package com.Selenium;

import java.util.Scanner;

public class TeenSum {
	public int teenSum(int first,int second) {
		int number=19,flag=0;
		if(((first>=13)&&(first<=19)) || ((second>=13)&&(second<=19))) {
		flag=1;
		}
		if(flag==1) {
			return number;
		}
		else {
			return Integer.sum(first, second);
		}
		
	
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner input= new Scanner(System.in);
		a= input.nextInt();
		b=input.nextInt();
		TeenSum ts = new TeenSum();
		System.out.println(ts.teenSum(a, b)); 
	}

}
