package com.Basic.Programs;

public class FibanciSeries {
	public static void fibnaciSeries(int num)
	{
		int i=0;
		int j=1;
		int sum=i+j;
		System.out.print(i+"\t"+j+"\t");
		while(sum<num)
		{
			i=j;
			j=sum;
			sum=i+j;
			if(sum>num){
				break;}
			System.out.print(sum+"\t");
			
		}
	}
	public static void main(String[] args) {
		fibnaciSeries(30);
		
	}

}
