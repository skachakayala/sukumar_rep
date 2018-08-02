package com.TestNG_Test;

public class SplitStringReverse {
	
	public static void main(String[] args) {
		String input="sukumar praveen sai kumar";
		String split[]=input.split(" ");
		for(int i=0;i<split.length;i++){
		if(i%2!=0)
		{
			String temp="";
			for(int j=split[i].length()-1;j>=0;j--)
			{
				temp+=split[i].charAt(j);
			}
			split[i]=temp;
			
		}
			
		}
		for(int i=0;i<split.length;i++)
			System.out.print(split[i]+" ");
	}

}
