package com.Basic.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void missingNumber()
	{
		int arr[]={1,2,3,5,6,7,10,8,8,8,12,20,13,19};
		//Arrays.sort(arr);
		int max=arr[arr.length-1];
		Set set = new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		for(int i=0;i<max;i++)
		{
			if(set.add(i)!=false)
			{
				System.out.println(i+" is missed");
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,5,6,7,8,8,8,7,7,7,6};
		int max=arr[arr.length-1];
		System.out.println(max);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			
			if(map.containsKey(arr[i]))
			{
				int count=map.get(arr[i]);
				map.put(arr[i], ++count);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		//Test2.missingNumber();
	}
}
