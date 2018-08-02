package com.Basic.Programs;

public class ReverseAlternateStrings {
	public static void main(String[] args) {
        String str="vital garigipati sukumar kachakayala";
        String[] str1=str.split(" ");
        String[] str2=new String[str1.length];
        for(int i=0;i<=str1.length-1;i++)
        {
              
              if(i%2!=0)
              {
                    String str3=str1[i];
                    //System.out.println(str1[i]);
                    String str4="";
                    for(int j=str3.length()-1;j>=0;j--)
                    {
                          str4=str4+str3.charAt(j);
                          
                          str2[i]=str4;
                          //System.out.println(str2[i]);
                          
                    }
              }
              else
              {
                    str2[i]=str1[i];
                    
              }
        }
        for(int i=0;i<str2.length;i++)
        {
              System.out.print(str2[i]+" ");
        }
  }



}
