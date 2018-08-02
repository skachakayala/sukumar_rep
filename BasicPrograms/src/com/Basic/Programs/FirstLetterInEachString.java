package com.Basic.Programs;

public class FirstLetterInEachString {
	public static void main(String[] args) {
		String str = "My name is sukumar";
		String splitStr[]=str.split(" ");
		for(int i=0;i<splitStr.length;i++)
		{
			System.out.println(splitStr[i].charAt(0));
		}
	}

}
