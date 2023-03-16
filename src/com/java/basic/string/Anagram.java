package com.java.basic.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Brag";
		String s2 = "Grab";

		int length1 = s1.length();
		System.out.println(length1);
		int length2 = s2.length();
		System.out.println(length2);

		String s3 = s1.toLowerCase();
		System.out.println(s3);
		String s4 = s2.toLowerCase();
		System.out.println(s4);

		char ch1[] = s3.toCharArray();
		char ch2[] = s4.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch1);
		System.out.println(ch2);

		if (Arrays.equals(ch1, ch2) == true) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
