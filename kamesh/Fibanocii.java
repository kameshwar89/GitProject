package com.kamesh;

import java.util.Scanner;

public class Fibanocii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
        int i,n1=0,n2 = 1 ,fib;
        System.out.print(n1+" "+n2);
        
        for(i=2;i<=number;i++)
        {
        	fib = n1 + n2;
        	System.out.println(" "+fib);
        	n1=n2;
        	n2=fib;
        	
        }
        		
	}

}
