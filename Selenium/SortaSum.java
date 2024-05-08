package com.Selenium;

public class SortaSum {
	public int sortaSum(int a,int b) {
		int c = a+b;
		if((c>=10)&&(c<=19)){
			return 20;
		}else {
			return c;
		}
	}
	public static void main(String[] args) {
		SortaSum sm = new SortaSum();
		System.out.println(sm.sortaSum(3, 4));
		System.out.println(sm.sortaSum(9, 4));
		System.out.println(sm.sortaSum(10, 11));
	}

}
