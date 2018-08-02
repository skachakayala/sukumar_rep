package com.Basic.Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadDataConsole {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String data = br.readLine();
		System.out.println(data);
		System.out.println("enter id");
		int id = Integer.parseInt(br.readLine());
		System.out.println(id);
	}

}
