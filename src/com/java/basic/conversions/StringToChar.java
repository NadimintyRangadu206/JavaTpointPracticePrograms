package com.java.basic.conversions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToChar {

	public List<Character> conv(String str) {
		
		List<Character> ch = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			
		ch.add(str.charAt(i));
		}
	
		
		
		return ch;
	}
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a String");
		
		String s=scanner.next();
		StringToChar c=new StringToChar();
		
		System.out.println(c.conv(s));
		
		
		char ch1[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			System.out.print(ch1[i]);
		}
		
		System.out.println();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}

		System.out.println();
		
		
	}

}
