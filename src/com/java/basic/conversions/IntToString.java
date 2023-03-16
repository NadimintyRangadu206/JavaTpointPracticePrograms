package com.java.basic.conversions;

import java.util.Scanner;

public class IntToString {

	
	public String conversion( int no) {
		
		//String str=Integer.toString(no);// one
		
		//String str=String.valueOf(no);// two
		
		String str=String.format("%d", no); // third
		
		return str ;
		
		
	}
	public static void main(String[] args) {
		 IntToString ts=new IntToString();
		 System.out.println("Enter a number:");
		 
		 Scanner sc= new Scanner(System.in);
			
		int no1=sc.nextInt();
		 System.out.println(ts.conversion(no1));
	}

}
