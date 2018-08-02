package com.Basic.Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharecterCount {
	public void getCharCount(String s){
		//String s="gngj";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			} 
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		//System.out.println(map);
		int maxValue=Collections.max(map.values());
		for(Map.Entry<Character, Integer> map1:map.entrySet())
		{
			if(maxValue==map1.getValue()){
				System.out.println(map1.getKey()+" "+map1.getValue());
			}
		}
		
		
		}
	public static void main(String[] args) {
		CharecterCount charCount = new CharecterCount();
		charCount.getCharCount("dffhbkddjfugdfhd");
		
	}

}
