package com.java.basic.string;
/**
 * 
 * In this class Aim is Characters are replacing UpperCase to LowerCase and LowerCase to UpperCase 
 * @author nadim
 *
 */
public class ChangeCase {

	public static void main(String[] args) {

		String str = "Great Power";
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				ch[i] = (char) (str.charAt(i) + 32);

			} else {
				ch[i] = (char) (str.charAt(i) - 32);

			}

		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		System.out.println();

		// Another Way:

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			} else {
				System.out.println("NO Character is Match...");
			}
		}

		System.out.print(sb);

//		for(int i=0;i<str.length();i++) {
//		Character.isLowerCase(str.charAt(i))?System.out.println(sb.setCharAt(i, Character.toLowerCase(str.charAt(i)))):sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
//		}
	}
}
