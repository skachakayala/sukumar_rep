package testEx;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class TestEx {
	public void reverseString()
	{
		String s="sukumar";
		String reverseString="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverseString=reverseString+s.charAt(i);
		}
		System.out.println("reverse of string is "+reverseString);
		
		
				
	}

	
	public static void main(String[] args) {
		
		/*String s="hello welcome to the java wprld java java";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					System.out.println(s1[i]);
					count++;
					
				}
				break;
			}
			System.out.println(s1[i]+" repetaed "+count );
			
		}*/
		List l= new ArrayList();
		l.add("sukumar");
		l.add("10");	
		l.add("20");
		
		ListIterator li = l.listIterator();
		System.out.println("forward direction");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("backword direction");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		List l2=new ArrayList();
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.addAll(3, l);
		System.out.println(l2);
		
	}

}
