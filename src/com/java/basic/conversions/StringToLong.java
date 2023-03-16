package com.java.basic.conversions;

import java.util.Scanner;

public class StringToLong {

	public static long convesion(String s) {

		long l = Long.valueOf(s);
		long l1 = Long.parseLong(s);

		return l + l1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();
//		StringToLong st = new StringToLong();

		System.out.println(StringToLong.convesion(str));
	}

}
