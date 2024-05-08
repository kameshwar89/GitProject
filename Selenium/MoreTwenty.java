package com.Selenium;

public class MoreTwenty {
	public boolean more20(int number) {
		if(number>20) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		MoreTwenty mt = new MoreTwenty();
		System.out.println(mt.more20(20)); 
		System.out.println(mt.more20(21));
		System.out.println(mt.more20(22));
	}

}
