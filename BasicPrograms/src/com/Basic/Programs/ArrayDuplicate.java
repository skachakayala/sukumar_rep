package com.Basic.Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jboss.netty.util.internal.SystemPropertyUtil;

public class ArrayDuplicate {
	
	public void duplicateElements()
	{
		int arr[]={1,3,4,5,
				4,6,5};
		for(int j=0;j<arr.length;j++)
		{
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[j]==arr[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr[j]);
			}

		}
	}
	public static void duplicateEle()
	{
		int arr[]={1,3,4,5,
				4,6,5};
		List list = new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		Map<Integer,Integer> map = new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			if(map.containsKey((arr[i])))
			{
				count = map.get(arr[i]);
				map.put(arr[i], ++count);
			}
			else
			{
				map.put(arr[i], count);
			}
		}
		
		System.out.println(map);
		System.out.println("duplicate elementsa are:");
		for(Map.Entry<Integer,Integer> mapen:map.entrySet())
		{
			if(mapen.getValue()==1)
			{
				System.out.println(mapen.getKey());
			}
		}
		
	}
	public static void main(String[] args) {
		duplicateEle();
		
}
}
