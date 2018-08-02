package com.Basic.Programs;

public class AmstrongNumberEx {
	public static void amstrongNumber(int num)
	{
		int amNum=num;
		int sum=0;
		int temp;
		while(num>0)
		{
			temp=num%10; //153%10=3
			sum=sum+(temp*temp*temp);
			num=num/10;
		}
		if(sum==amNum){
			System.out.println(amNum+" is amstrong numenr ");
			System.out.println("sum of cubes of "+amNum+" is "+sum);
		}
		
		else{
			System.out.println(amNum+" is not a amstrong numenr ");
			System.out.println("sum of cubes of "+amNum+" is "+sum);
		}
	}
	public static void pallimdrome(int num)
	{
		int givenNum=num;
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("reverse of numer "+sum);
		if(givenNum==sum)
			System.out.println(givenNum+" number is pallindrome");
		else
			System.out.println(givenNum+" number is not pallindrome");
			
	}
	public static void main(String[] args) {
		
		//amstrongNumber(153);
		pallimdrome(151);
	}

}
