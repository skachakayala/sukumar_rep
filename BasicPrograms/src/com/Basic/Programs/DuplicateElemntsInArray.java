package com.Basic.Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElemntsInArray {
	public void duplicate()
	{
		int arr[]={10,20,30,55,454,20,30};
		Set set = new HashSet();
		System.out.println("duplicate elements are:");
		for(int i=0;i<arr.length;i++)
		{
			if(!set.add(arr[i]))
			{
				System.out.println(arr[i]);
			}
			
			
		}
			
			System.out.println("non duplicate elements:");
			System.out.println(set);
	}
	public static void main(String[] args) {
		DuplicateElemntsInArray da = new DuplicateElemntsInArray();
		da.duplicate();
	}

}
