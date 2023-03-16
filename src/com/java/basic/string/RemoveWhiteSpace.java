package com.java.basic.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str="Remove white spaces";
		
		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher(str);
		
		while(m.find()) {
			System.out.print(m.group());
		}

	// Second  Way
		String [] arr= str.split("\\s");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	// Third Way	
		System.out.println();
		StringTokenizer st= new StringTokenizer(str," ");
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
		
		
		// Forth Way:
		System.out.println();
		char ch=' '; 
		
		for(int i =0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
				System.out.print(str.charAt(i));
			}
		}
		
		
		// Fifth way:
		
		List<Character> list= new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			list.add(str.charAt(i));
			
		}
		List<Character> ar= new ArrayList<>();
		System.out.println();
	
	ar  = list.stream().filter(i->i!=' ').collect(Collectors.toList());
	System.out.println(ar);
	
//	                       (or)
	
	list.stream().filter(i->i!=' ').forEach(System.out::print);

	System.out.println();
	
	// Sixth way:
	
	String s=str.replace(" ","");
	System.out.print(s);
	
	}

}
