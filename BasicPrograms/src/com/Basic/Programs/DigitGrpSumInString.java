package com.Basic.Programs;

public class DigitGrpSumInString {
	public static void digitGrpSum(String input)
	{
		String mainString="";
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				
					mainString=mainString+input.charAt(i)+"";
					i++;
					if(Character.isDigit(input.charAt(i)))
					{
						mainString=mainString+input.charAt(i)+"";
						//i++;
						continue;
					}
					else
					{
						mainString=mainString+" ";
					}
			}
		}
		System.out.println(mainString);
		/*String split[]=mainString.split(" ");
		int sum=0;
		//System.out.println("total digit sum is:");
		for(String s:split)
		{
			sum=sum+Integer.parseInt(s);
			System.out.println("\t\t\t"+s);
		}
		System.out.println("\t\t\t======");
		System.out.println("total digit sum in "+input+" is=\t"+sum);*/
	}
	
	public static void digitGrpSum2(String input)
	{
		String mainString="";
		boolean status;
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				status=true;	
			}
			else
			{
				status=false;
			}
			if(status)
			{
				mainString=mainString+" ";
				//break;
				
			}
			else
			{
				mainString=mainString+input.charAt(i)+"";
				//break;
			}
			
				
				
			
		}
		System.out.println(mainString);
		/*String split[]=mainString.split(" ");
		int sum=0;
		//System.out.println("total digit sum is:");
		System.out.println(split.length);
		for(String s:split)
		{
			//sum=sum+Integer.parseInt(s.trim());
			System.out.println("\t\t\t"+s);
		}
		//System.out.println("\t\t\t======");
		//System.out.println("total digit sum in "+input+" is=\t"+sum);
*/	}
	
public static void main(String[] args) {
	//digitGrpSum("dfhjndfkjh677jdfghj57687ndf4568sdgfds");
	//digitGrpSum("dfhjndfkjh6001jdfghj5000ndf4000sdgfds");
	digitGrpSum2("12sdgh8556sd565ngh94387ndfkh983476");
}

}
