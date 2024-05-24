
//How do you remove spaces from a string in Java

package com.StringQustion;

public class RemoveSpace {

	public static void main(String[] args) {
		String str="you   need     learn  java";
		//trim only remove  leading and trailing space that's why not use trim method
		//str=str.trim();
		//we used replaceAll method
		String s=str.replaceAll("\\s", "");
		System.out.println(s);
	}

}
