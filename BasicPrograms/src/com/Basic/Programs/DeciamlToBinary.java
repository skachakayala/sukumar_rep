package com.Basic.Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DeciamlToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		//System.out.println(Integer.toBinaryString(number));
		 //int binary[] = new int[40];
		List list = new ArrayList();
	     int index =1;
	     while(number>=1){
	    	 list.add(number%2);
	       number = number/2;
	       index++;
	     }
	     /*for(int i = binary.length-1;i>0;i--){
	       System.out.print(binary[i]);*/
	     System.out.println(list);
	     Iterator i = list.iterator();
	     System.out.println(i.hasNext());
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	     }

	}

