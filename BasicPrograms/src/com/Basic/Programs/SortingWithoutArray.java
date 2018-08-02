package com.Basic.Programs;

public class SortingWithoutArray {
	
	public static void sort(int num)
	{
		int rem=0;
		int max1,max2;
		max1=max2=0;
		int sum=0;
		int temp=0;
		int count=1;
		
		for(int i=0;i<3;i++)
		{
			while(num>0)
			{
				rem=num%10;
				if(rem>max1)
				{
					max1=rem;
				}
				
				num=num/10;
				
				
			}
			//System.out.println(max1);
			if(max1>temp)
			{
				temp=max1;
			}
			
			while(num>0)
			{
				rem=num%10;
				if(rem!=temp)
				sum=(sum*10)+rem;
			}
			count++;
			num = sum;
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		sort(598);
		
	}

}
