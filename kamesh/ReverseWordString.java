
package com.kamesh;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseWordString {
		public static void reverse(String words) {
			//Pattern  pattern = Pattern.compile("\\s");
			//String[] temp = pattern.split(words);
			String[] temp = words.split(" ");
			for(int i = temp.length-1; i>=0;i--) {
				System.out.print(temp[i]+" ");
								
			}
	
			
		}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		reverse(x);
		
	}

}
