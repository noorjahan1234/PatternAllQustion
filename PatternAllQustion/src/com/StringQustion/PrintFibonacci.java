package com.StringQustion;

import java.util.Scanner;

public class PrintFibonacci {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=sc.nextInt();
		 finFibonaciSerise(n);
	}

	public static void finFibonaciSerise(int n) {
		int a=0;
		int b=1;
		int c;
		for(int i=1; i<=n; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			//System.out.print(c+" ");
		}
	}

}
