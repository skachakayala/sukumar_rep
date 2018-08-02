package com.Basic.Programs;

public class RemoveDuplicates {
	public static void dupStrings(String s)
	{
		String split[]=s.split(" ");
		String withoutDuplicate[]=new String[split.length];
		int k=0;
		for(int i=0;i<split.length;i++)
		{
			int count=0;
			for(int j=0;j<split.length;j++)
			{
					if(split[i].equalsIgnoreCase(split[j]))
					{
						count++;
					}
			}
			if(count==1)
			{
				withoutDuplicate[k]=split[i];
				k++;
			}
			
		}
		for(String s1: withoutDuplicate){
			
			if(s1!=null){
			System.out.println(s1);
			}
			
		}
		if(k==0)
		{
			System.out.println("all the elements are duplicate elements");
		}
	}
	
	public static void dupNumbers(int arr[])
	{
		int[] arrayByRemovingDup=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				arrayByRemovingDup[k]=arr[i];
				k++;
			}
		}
		for(int i:arrayByRemovingDup)
		{
			if(arrayByRemovingDup.length==0){
				System.out.println("all the elements are duplicate elements");}
			if(i!=0)
			System.out.println(i);
		}
		if(k==0)
		{
			System.out.println("all the elements are duplicate elements");
		}
	
	}
	public static void main(String[] args) {
		dupStrings(" sai sukumar demo pavan sai  pavan vijay srinivas vijay vijay srinivas");
		//int ele[]={10,20,5,5,5,10,5,2,10,10,10,10};
		//dupNumbers(ele);
	}

}
