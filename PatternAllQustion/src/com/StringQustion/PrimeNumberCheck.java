package com.StringQustion;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		findPrimeNumber(n);
	}
	private static void findPrimeNumber(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("yes this is prime number: "+n);
		}
		else {
			System.out.println("No this is not prime number: "+n);
		}
	}
}
