
//How do you check if a list of integers contains only odd numbers in Java?
package com.StringQustion;

import java.util.*;


public class CheckListOdd {

	public static void main(String[] args) {
		
		List<Integer> al=Arrays.asList(1,3,5,9);
		boolean res=findListOdd(al);
		System.out.println(res);
	}
	private static boolean findListOdd(List<Integer> al) {
		
		for(int num : al) {
			if(num%2==0) {
				return false;//1,3,6,5,9
			}
		}
		return true; //1,3,5,9
	}

}
