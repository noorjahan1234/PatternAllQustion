package com.StringQustion;

import java.util.Scanner;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Chech Duplicate Word in java: "+findDuplicateWord(str));
	}

	public static String findDuplicateWord(String str) {
		int count;
		String[] word=str.split(" ");
		str=str.toLowerCase();
		for(int i=0; i<word.length; i++) {
			count=1;
			for(int j=i+1; j<word.length; j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
			}
			if(count>1 && word[i] !="0") {
				return word[i];
			}
		}
		return null;
	}
}
