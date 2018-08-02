package com.Basic.Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateStrings {
	public static void duplicateStrings(String s)
	{
		String split[]=s.split(" ");
		Map<String ,Integer> map = new HashMap<String ,Integer>();
		for(String s1:split)
		{
			if(map.containsKey(s1))
			{
				int value = map.get(s1);
				map.put(s1, ++value);
			}
			else
			{
				map.put(s1, 1);
			}
		}
		for(Entry<String ,Integer> entry:map.entrySet())
		{
			//if(entry.getValue()>1)
			//{
				System.out.println(entry.getKey()+" repeated "+entry.getValue()+" times");
			//}
		}
	}
	public static void main(String[] args) {
		duplicateStrings("java java c oracle selenium sql selenium sql");
	}

}
