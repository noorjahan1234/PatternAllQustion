package com.StringQustion;

import java.util.Scanner;

public class StringPermutations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int n=str.length();
		int f=factorial(n);
		System.out.println(f);
	}
		public static int factorial(int n) {
		int fac = 1;
		for(int i=1; i<n; i++) 
		{
			fac=fac*i;
		}
		return fac;
		}
}
