package com.kamesh;
import java.io.*;
import java.util.Scanner;

public class LeftTriangle {
	public void StarRightTriangle()
	{
		int a, b;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (a = 0; a < n; a++) {

			for (b = 0; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		LeftTriangle leftTriangle= new LeftTriangle();
		leftTriangle.StarRightTriangle();
	}
}
