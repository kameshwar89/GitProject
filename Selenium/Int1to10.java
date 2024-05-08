package com.Selenium;

public class Int1to10 {
	public boolean int1to10(int n,boolean value) {
		if((n>=1)&&(n<=10) && !value) {
			return true; 
		}else if((n<=1)||(n>=10) && value) {
			return true;
		}else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Int1to10 inp = new Int1to10();
		System.out.println(inp.int1to10(5,false)); 
		System.out.println(inp.int1to10(11,false)); 
		System.out.println(inp.int1to10(11,true)); 
	}

}
