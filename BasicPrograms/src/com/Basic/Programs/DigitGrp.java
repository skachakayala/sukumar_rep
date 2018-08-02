package com.Basic.Programs;

import java.util.ArrayList;

public class DigitGrp {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		String temp = "";
		String str1="What is 10 + 10? Answer this simple question!";
		String str = "";
		
		for(int i = 0;i<str.length();i++){
			
			if(Character.isDigit((str.charAt(i)))){
				temp+=str.charAt(i);
				
				if(i==str.length()-1){
					al.add(Integer.valueOf(temp));
					temp = "";
					break;
				}
			}else if(Character.isAlphabetic(str.charAt(i))&&!("".equals(temp))){
				al.add(Integer.valueOf(temp));
				temp = "";
			}

		}int sum = 0;
		for(int val:al){
			sum+=val;
			System.out.print(val+"\t");
		}
		System.out.println();
		System.out.println("sum is ="+sum);
	}

}
