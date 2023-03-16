package com.java.basic.patterns;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 * Pattern Out put
 *  *000*000*
 *   0*00*00*0
 *   00*0*0*00 
 *   000***000
 * 
 * @author nadim
 *
 */
public class Pattern2 {

	public static void main(String[] args) {
		
		
//		LocalDate date= LocalDate.now();
//		System.out.println(date);
//		
//		LocalTime time= LocalTime.now();
//		System.out.println(time);
		
		
		System.out.println(LocalDate.now()+" "+LocalTime.now());
		
		int k = 9;
		
		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < 10; j++) {

				if (j == i) {
					System.out.print("*");
				} else if (j == 5) {
					System.out.print("*");
				} else if (j == k) {
					System.out.print("*");
					k--;
				} else {
					System.out.print("0");
				}
			}
			System.out.println();

		}
	}

}
