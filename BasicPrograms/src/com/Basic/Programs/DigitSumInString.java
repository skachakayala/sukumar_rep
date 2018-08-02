package com.Basic.Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DigitSumInString {
	public static int sumOfDigitInString(String s)
	{
		 
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i)))
			{
				sum=sum+Character.getNumericValue(s.charAt(i));
			}
	}
	//System.out.println(sum);
		return sum;
	}
	
	public static void combiNumerics(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i)))
			{
				sum=(sum*10)+(Character.getNumericValue(s.charAt(i)));
			}
		}
		System.out.println(sum);
	}
	
	public static void getmaxCountOFRepeatingCharecter(String s)
	{
		Map<Character,Integer> map =  new  HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			
			if(map.containsKey(s.charAt(i)))
			{
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		//System.out.println(map);
		int maxkey=Collections.max(map.values());
		System.out.println();
		for(Entry<Character, Integer> en :map.entrySet())
		{
			if(en.getValue()==maxkey)
				System.out.println(en.getKey()+" repeating "+en.getValue()+" times");
		}
	}
	public void getmaxCountOFRepeatingCharecterWithoutCollections(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			
		}
	}
	public static void main(String[] args) {
		//System.out.println(DigitSumInString.sumOfDigitInString("ghdkh3333jj333"));	
		//combiNumerics("ghdkh3333jj333");
		getmaxCountOFRepeatingCharecter("vijay");

}
}
