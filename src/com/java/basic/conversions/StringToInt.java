package com.java.basic.conversions;

public class StringToInt {

	public static void main(String[] args) {
	
		
String str="222";

int no= Integer.parseInt(str);// an other way

int n1= Integer.valueOf(str);// one way 

System.out.println(no);
System.out.println(n1);

int n=Integer.valueOf(str);
	}

}
