package com.TestNG_Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	
	public static void pattern()
	{
		String s="12sdgh8556sd565ngh94387ndfkh983476";
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(s);
		int sum=0;
		while (m.find()) {
		    //int n = Integer.parseInt(m.group());
		    //sum+=n;
		    System.out.print(m.group());
		    System.out.print("+");
		    // append n to list
		}
		//System.out.print(sum);
	}
	public static void main(String[] args) {
		pattern();
	}
		/*String input= "What is 10 + 10? Answer this simple question!";
		String split[]=input.split(" ");
		int index=0;
		for(int i=0;i<split.length;i++){
			System.out.println(i+" "+split[i]);
			if(split[i].equalsIgnoreCase("+"))
			{
				index=i;
			}
		}
		System.out.println("+ index is "+index);
		int sum=0;
		if(index!=0){
		sum=Integer.parseInt(split[index-1])+Integer.parseInt(split[index+1].replace("?", ""));
		System.out.println("sum of digits "+sum);
		}
		else
		{
			System.out.println("+ symbol not avaialable");
		}
		
	}*/

}
