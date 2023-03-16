package com.java.basic.conversions;

import java.util.Scanner;

public class StringToFloat {

	public float conv(String s1) {
		
		float f=Float.parseFloat(s1);
		float f1=Float.valueOf(s1);
		return f;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String g = scanner.next();
		StringToFloat sl = new StringToFloat();
		System.out.println(sl.conv(g));
	}

}
