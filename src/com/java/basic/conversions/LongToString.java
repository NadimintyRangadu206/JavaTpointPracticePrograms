package com.java.basic.conversions;

import java.util.Scanner;

public class LongToString {

	public String conversion(long l) {

		String str = String.valueOf(l);
		String s1 = Long.toString(l);
		return str + "," + s1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a long Number:");
		long g = scanner.nextLong();
		LongToString sl = new LongToString();
		System.out.println(sl.conversion(g));
	}

}
