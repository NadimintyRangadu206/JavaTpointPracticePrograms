package com.java.basic.string;

import java.util.Scanner;

public class DivideString {

	public String[] parts(String str) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit:");
		int limit = sc.nextInt();

		int length = str.length();
		int temp = 0;
		int chars = length / limit;

		String arr[] = new String[limit];

		for (int i = 0; i < length; i = i + chars) {

			String s = str.substring(i, i + chars);

			arr[temp] = s;
			temp++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");

		String st = sc.next();

		DivideString ds = new DivideString();
		System.out.println(ds.parts(st));

	}

}
