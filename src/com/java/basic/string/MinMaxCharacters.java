package com.java.basic.string;

public class MinMaxCharacters {

	public static void main(String[] args) {

		String str = "grass is greener on the other side";

		
		
		char ch[]=new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {

			for (int j = 1; j < str.length(); j++) {

				int count =0;
				if(str.charAt(i)==str.charAt(j)) {
					char ch2=str.charAt(i);
					count++;
					ch[i]=ch2;
					
				}
			}
		}
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}

	}

}
