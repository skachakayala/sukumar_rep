package testEx;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InterfaceImpl implements IntercaeEx{

	public void method()
	{
		System.out.println("implemtned method");
	}
	{
		System.out.println("not static block");
	}
	static{
		System.out.println(" static block");
	}
	
	
	public static void vowelRemoveprog()
	{
		String s="sabcdefghijklokjkluo";
		String afterVowelsRemove="";
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
		{
			afterVowelsRemove=afterVowelsRemove+s.charAt(i);
		}
		}
		System.out.println(afterVowelsRemove);
	}

	public static void main(String[] args) {
		
		Date date = new Date();
		 
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
 
        System.out.println(formatter.format(date));
	}

}
