package com.Basic.Programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Laregest3rdNumberWithoutArray {
	public static void thirdLargestNumer(int num)
	{
		int rem;
		int max1,max2,max3;
		
		//max1=num%10;
	max1=max2=max3=0;
		 max1=0;
		while(num>0)
		{
			
			rem = num%10;
			if(rem>max1)
			{
				if(max1>max2)
				{
					max2=max2;
				}
				max1=rem;
			}else if(max1>rem&&max2<rem)
			{
				max2=rem;
			}
			num=num/10;
			
		}
			//System.out.println(i+" iteration:");
		System.out.println(max1+" "+max2+" "+max3);
		//System.out.println(max3);
		//int temp1=max1;
	}
		
		

	
	public static void thirdLargestNumerWithCollection(String num)
	{
		List list = new LinkedList();
		for(int i=0;i<num.length();i++)
		{
			list.add(Character.getNumericValue(num.charAt(i)));
		}
		Collections.sort(list);
		System.out.println("2nd highest number in given number is "+list.get(list.size()-2));
	}
	public static void main(String[] args) {
		thirdLargestNumer(186645);//158484569
		//thirdLargestNumerWithCollection("123456789");
		
	}

}
