package com.Basic.Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SeconBiggestNumber {
public static void main(String[] args) {
	
	int arr[]={10,50,68,10,05,68,56,23,89,45,35,56};
	List list = new ArrayList();
	for(int i=0;i<arr.length;i++)
	{
		list.add(arr[i]);
	}
	Collections.sort(list);
	System.out.println(list);
	System.out.println("Second highest element in list is "+list.get(list.size()-2));
}
}
