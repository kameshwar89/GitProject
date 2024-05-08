package com.kamesh;
import java.util.Scanner;

public class RightTriangle {
	public void StarRightTriangle()
	{
		int a, b;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (a = 0; a <n; a++) {

			for (b = 0; b <n; b++) {
				if(a+b>=n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		RightTriangle rightTriangle= new RightTriangle();
		rightTriangle.StarRightTriangle();
	}
}