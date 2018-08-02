package com.Basic.Programs;

public class PatternPrograms {
	
	
	public static void startIncriPattern()
	{
		System.out.println("Incriment pattern");
		System.out.println("=================");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void startDecriPattern()
	{
		System.out.println("Decriment pattern");
		System.out.println("=================");
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void startIncriNumberPattern()
	{
		System.out.println("Incriment number pattern");
		System.out.println("========================");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public static void startDecriNumberPattern()
	{
		System.out.println("Decriment number pattern");
		System.out.println("========================");
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public static void startIncriNumberIncriPattern()
	{
		System.out.println("Incriment number pattern");
		System.out.println("========================");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	public static void startDecriNumberIncriPattern()
	{
		System.out.println("Decriment number pattern");
		System.out.println("========================");
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void startPattern()
	{
		int num=5;
		int k=1;
		while(num>0)
		{
			for(int i=0;i<num;i++)
			{
				System.out.print(" ");
			}
			for(int i=0;i<k;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			num--;
			k+=2;
		}
	}
	
	public static void main(String[] args) {
		/*startIncriPattern();
		startDecriPattern();
		startIncriNumberPattern();
		startDecriNumberPattern();
		startIncriNumberIncriPattern();
		startDecriNumberIncriPattern();*/
		startPattern();
	}

}
