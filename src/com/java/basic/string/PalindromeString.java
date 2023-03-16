package com.java.basic.string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.next();

		String reverse = new String();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not Palindrome");
		}
		System.out.println();

		// This Approach is not Correct
		StringBuilder sb = new StringBuilder();

		sb.append(str);
		System.out.println("Before" + " " + sb);

		StringBuilder sb1 = new StringBuilder();

		sb1 = sb.reverse();

		if (sb.equals(sb1)) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
	}

}
