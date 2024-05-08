package com.Selenium;

public class WithoutDoubles {
	public int withoutDoubles(int a, int b, boolean value) {
		if((a==b) && value) {
			return (a+b)+1;
		}else if(((a+b)>=1 && (a+b)<=6) && value) {
			return (a+b);
		}else {
			return a+b;
		}
	}
	public static void main(String[] args) {

WithoutDoubles wd = new WithoutDoubles();
System.out.println(wd.withoutDoubles(2, 3, true));
System.out.println(wd.withoutDoubles(3, 3, true));
System.out.println(wd.withoutDoubles(3, 3, false));
	}

}
