package com.StringQustion;

import java.util.Scanner;

public class NonRepeatedCharacterFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char res=findRepeating(str);
		if(res !=' ') {
			System.out.println("Non Repeating Character: "+res);
		}
		else {
			System.out.println("Repeating Character: "+res);
		}
	}

	public static char findRepeating(String str) {
		//this is count frequency for each character
		int[] count=new int[256];
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			count[ch]++;
		}
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(count[ch] == 1) {
				return ch;
			}
		}
		return ' ';
	}

}
