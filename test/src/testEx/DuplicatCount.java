package testEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicatCount {

	public static void diplicate()
	{
		String s= "india,america,india,america,jersy";
		String split[]=s.split(",");
			for(int i=0;i<split.length;i++)
			{
				int count=0;
				for(int j=i+1;j<split.length;j++)
				{
					
					if(split[i].equals(split[j]))
					{
					count++;
					}
					
				}
				System.out.println(split[i]+" "+count);
			}
	}
	
	
	
	public static void  digcnt()
	{
		String n="abdjshbj123jgfd67nh437";
		//String n=s.next();
		int sum=0;
		String st="";
		String[] s = n.split("[a-zA-Z]+");
		/*for(int i=0;i<s.length;i++)
		{
			//sum=sum+Integer.parseInt(s[i].trim());
			System.out.print(s[i]);
			System.out.print("+");
		}*/
		for(String s1:s)
		{
			st=st+s1+"+";
			System.out.println(s1);
		}
		System.out.println(st);
		
		
		
		
	}
	public static void digitcnt()
	{
		String n="abdjshbj123jgfd67nh437";
		String s="";
		for(int i=0;i<n.length();i++)
		{
			if(!Character.isAlphabetic((n.charAt(i))))
			{
				s=s+n.charAt(i);
				//i++;
				/*if(Character.isDigit(n.charAt(i)))
				{
					continue;
				}
				*/
			}
		}
		System.out.println(s);
		System.out.println("welcome");
	}
	
	public static void duplicateCountUsingCollection()
	{
		String s="sai,ram,sai,god,god";
		String split[]=s.split(",");
		Map<String,Integer> map= new LinkedHashMap<String,Integer>();
		System.out.println(map);
		for(int i=0;i<split.length;i++)
		{
			if(map.containsKey(split[i]))
			{
				int cnt=map.get(split[i]);
				map.put(split[i], ++cnt);
			}
			else
			{
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
		System.out.println(map.keySet());
	}
	public static void duplicatewords()
	{
		String s="sai,ram,sai,god,god";
		String split[]=s.split(",");
		List<String> duplist= new ArrayList<String>();
		List<String> nonDuplist= new ArrayList<String>();
		Set<String> hs= new HashSet<String>();
		
		for(int i=0;i<split.length;i++)
		{
			if(duplist.contains(split[i]))
			{
				
				
				nonDuplist.add(split[i]);
			}
			else
			{
				duplist.add(split[i]);
			}
		}
		for(int i=0;i<split.length;i++)
		{
			hs.add(split[i]);
		}
		System.out.println("non duplicate strings"+hs);
		System.out.println("duplicate strings "+nonDuplist);
	}
	
	public static void main(String[] args) {
		//digitCount();
		//digcnt();
		//digitcnt();
		//duplicateCountUsingCollection();
		//diplicate();
		duplicatewords();
		

	}

}
