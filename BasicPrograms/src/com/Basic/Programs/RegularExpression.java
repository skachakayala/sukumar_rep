package com.Basic.Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher =pattern.matcher("100safhaddd500dgd500skh");
		int sum=0;
		while(matcher.find())
		{
			//count++;
			//matcher.en
			sum=sum+Integer.parseInt(matcher.group());
			System.out.println(matcher.group());
		}
		System.out.println("sum count is "+sum);
	}

}
