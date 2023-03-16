package com.java.basic.string;

public class AllSubsets {

	public static void main(String[] args) {
		
		// formula ---> n*(n+1)/2
		
	String str="RANGA";
	
	int length=str.length(); int temp=0;
	
	String arr[]= new String[length*(length+1)/2];
	
	for(int i=0;i<str.length();i++) {
		
	      for(int j=i;j<str.length();j++) {
	    	  arr[temp]=str.substring(i, j+1);
	    	  temp++;
	      }
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	}

}
