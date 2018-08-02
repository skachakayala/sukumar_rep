package com.Basic.Programs;

import java.util.Scanner;

import org.openqa.selenium.support.PageFactory;

public class MaxMinAvg {
	Scanner sc;
	int num[]=new int[10];
	boolean response;
	public void readNumbersFromConsole()
	{
		int i=0;
		do{
			System.out.println("Enter number:");
			sc = new Scanner(System.in);
			num[i]=sc.nextInt();
			i++;
			System.out.println("enter yes if you want given number again or enter no if dont want to enter number:");
			if(sc.next().equalsIgnoreCase("yes"))
			{
				response = true;
			}
			else
			{
				response = false;
			}
		}while(response);
		for(int j=0;j<num.length;j++){
			if(num[j]==0)
				break;
			System.out.println(num[j]);
		}
	}
	public void sortArray()
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				
					if(num[i]<num[j])
					{
						int temp = num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				
			}
			
		}
		System.out.println("number in acending order :");
		for(int k=0;k<num.length;k++){
			if(num[k]!=0){
				System.out.println(num[k]);
				}
			
		}
	}
	public void minmaxavg()
	{
		System.out.println("min valaue is:"+num[0]);
		System.out.println("max valaue is:"+num[num.length-1]);
		int sum=0;
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
			count++;
		}
		System.out.println("avg of number is "+sum/count);
		
	}
	
	public void max()
	{
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=0)
			{
				if(num[i]>max)
				{
					max=num[i];
				}
			}
		}
		System.out.println("max value is "+max);
	}
	
	public void min()
	{
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=0)
			{
				if(num[i]<=min)
				{
					min=num[i];
				}
			}
		}
		System.out.println("max value is "+min);
	}
	
	public static void main(String[] args) {
		MaxMinAvg maxmin = new MaxMinAvg();
		maxmin.readNumbersFromConsole();
		maxmin.max();
		maxmin.min();
		//maxmin.sortArray();
		//maxmin.minmaxavg();
		
	}

}
