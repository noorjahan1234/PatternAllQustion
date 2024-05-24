
//How do you check whether a string is a palindrome in Java
package com.StringQustion;

import java.util.Scanner;

public class PalindromeChecker {

	private static boolean findPalindrom(String str) {
		String revstr="";
		for(int i=str.length()-1; i>=0; i--) {
			revstr=revstr+str.charAt(i);
			if(str.equals(revstr)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		boolean res=findPalindrom(str);
		System.out.println("Palindrom String: "+res);
	}
}
