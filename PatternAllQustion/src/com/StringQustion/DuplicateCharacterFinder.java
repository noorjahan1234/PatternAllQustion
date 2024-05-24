package com.StringQustion;

import java.util.*;
import java.util.Scanner;

public class DuplicateCharacterFinder {

	public static void findDuplicateCharacter(String str) {
		Map<Character,Integer> charCount= new HashMap<>();
		char[] ch = str.toCharArray();
		for(char keys : ch) {
			if(Character.isAlphabetic(keys)) {
				if(charCount.containsKey(keys)) {
					charCount.put(keys, charCount.get(keys)+1);
				}
				else {
					charCount.put(keys, 1);
				}
			}
		}
		System.out.println(charCount);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		findDuplicateCharacter(str);
	
	}
}
