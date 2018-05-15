package com.Basic.Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateEle {

	
	public static void main(String[] args) {
		List list =new ArrayList();
		for(int i=0;i<30;i++)
		{
			list.add(i);
		}
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(40);
		//System.out.println("list elements "+list);
		List list1=new ArrayList();
		Set set= new HashSet(); 
		List list2=new ArrayList();
		{
			for(int i=0;i<list.size();i++)
			{
				for(int j=i+1;j<list.size();j++)
				{
					if(list.get(i).equals(list.get(j)))
					{
						set.add(list.get(i));
						break;
					}
					
				}
			}
		}
		System.out.println(set);
		//System.out.println(list2);

	}

}
