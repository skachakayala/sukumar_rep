package com.Basic.Programs;

import java.util.Scanner;

public class VijayTest {
public static void testVijay()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.next();
	for(int i=0;i<s.length();i++)
	{
		int count=0;
		char tempChar=' ';
		int tempCount=0;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				//System.out.println(s.charAt(i));
				count++;
				tempChar=s.charAt(j);
			}
			
		}
		tempCount=count;
		if(count>0)
		System.out.println(tempChar+" repeating "+tempCount+" times");
	}
}
	public static void testVijay2()
	{
		String ch="dsggljjdsf";
		 int count=0,len=0;
	        do
	        {  
	          try
	          {
	          char name[]=ch.toCharArray();
	              len=name.length;
	              count=0;
	              for(int j=0;j<len;j++)
	               {
	                  if((name[0]==name[j])) 
	                      count++;
	               }
	              if(count!=0)
	                System.out.println(name[0]+" "+count+" Times");
	              
	              ch=ch.replace(""+name[0],"");          
	          }
	          catch(Exception ex){}
	        }
	        while(len!=1);
	}
	
	public static void vijayReplace()
	{
		String ch="vijay";
		ch=ch.replace(""+'i', "");
		System.out.println(ch);
	}
	
	public static void pcombi()
	{
		String s="abcd";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				for(int k=0;k<s.length();k++)
				{	
					for(int l=0;l<s.length();l++)
					{
						count++;
						if((i!=j)&&(i!=k)&&(j!=k)&&(i!=l)&&(l!=j)&&(l!=k))
							System.out.println(s.charAt(i)+""+s.charAt(j)+""+s.charAt(k)+""+s.charAt(l));
				}
			}
		}
	}
		System.out.println("count is "+count);
}
public static void main(String[] args) {
	//testVijay();
	//testVijay2();
	//vijayReplace();
	pcombi();
}
}
