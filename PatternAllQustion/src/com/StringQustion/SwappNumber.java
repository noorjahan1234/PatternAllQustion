package com.StringQustion;

import java.util.Scanner;

public class SwappNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Before swapping Number: "+n1+" "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping Number: "+n1+" "+n2);
	}

}
