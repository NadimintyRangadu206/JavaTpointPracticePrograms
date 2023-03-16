package com.java.basic.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountVowAndCons {

	public static void main(String[] args) {
		
		
		String str="This is a really simple sentence";
		
		int vCount=0; int cCount=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='A'||str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'||
					str.charAt(i)=='U'|| str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
				
			}
			else {
				if(str.charAt(i)!=' ') {
				cCount++;
				}
			}
		}
		
		System.out.println("vcount"+" "+vCount);
		System.out.println("ccount"+" "+cCount);
		
		
	
		List<Character> list= new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			list.add(str.charAt(i));
		}
		
		List<Character> lt= new ArrayList<>();
		lt=list.stream().filter(i->(i>='A' && i<='Z'|| i>='a' && i<='z' || i!=' ')).collect(Collectors.toList());
		
//		for(Character ch:lt) {
//			System.out.print(ch);
//		}
		
		System.out.println();
		List<Character> l= new ArrayList<>();
		l=list.stream().filter(i->(i=='A'|| i=='E' || i=='I' ||i=='O' || i=='U'|| i=='a'|| i=='e' || i=='i' ||i=='o' || i=='u' || i!=' ')).collect(Collectors.toList());
		System.out.println(l);
	}

}
