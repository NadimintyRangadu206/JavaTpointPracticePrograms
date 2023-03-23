package com.java.basic.conversions;

public class StringToInt {

	public static void main(String[] args) {
	
		
String str="222";

int no= Integer.parseInt(str);// an other way

int n1= Integer.valueOf(str);// one way 

System.out.println(no);
System.out.println(n1);

int n=Integer.valueOf(str);


String s="ssfjhe";


for(int i=0;i<s.length();i++) {
	
	int coun=(int)s.charAt(i);
	System.out.println(coun);
	
}
	}

}
