package com.java.basic.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;

public class CountPunctuation {

	public static void main(String[] args) {

		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";

		Pattern p = Pattern.compile("[^A-Za-z0-9][\\s][\\W]");//--------->//Method1
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()) {

			System.out.println(m.group());
			count++;

		}
		System.out.println(count);

		int cou = 0;                           // Method-2
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '\'' || str.charAt(i)=='\"') {
				cou++;
			}
		}
		System.out.println(cou);

		// Stream Using

		
		List<Character> chList=new ArrayList<>();    // Method-3
		
		for(int i=0;i<str.length();i++) {
			chList.add(str.charAt(i));
		}
		
	chList.stream().filter(i->i==','|| i=='.' || i=='\'').forEach(System.out:: print);


	}

}
