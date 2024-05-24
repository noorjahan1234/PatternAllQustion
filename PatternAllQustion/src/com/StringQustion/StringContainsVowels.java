package com.StringQustion;

import java.util.Scanner;

public class StringContainsVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println(findVowel(str));
	}
		private static boolean findVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
		
	}

}
