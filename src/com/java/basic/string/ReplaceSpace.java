package com.java.basic.string;

public class ReplaceSpace {

	public static void main(String[] args) {

		String str = "Once in a blue moon";
		char c = '-';
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				ch[i] = c;
			} else {
				ch[i] = str.charAt(i);
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		System.out.println();

		// Another Way
		String s = str.replace(" ", "-");
		System.out.println(s);
	}

}
