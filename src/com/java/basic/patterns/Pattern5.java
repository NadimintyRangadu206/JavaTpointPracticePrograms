package com.java.basic.patterns;

/**
 * 
 * @author nadim
 * 
 *         0 
 *         909
 *         89098
 *         7890987 
 *         678909876 
 *         56789098765 
 *         4567890987654
 *         345678909876543
 *         23456789098765432
 *         1234567890987654321
 *
 *
 */
public class Pattern5 {

	public static void main(String[] args) {

		
		for(int i=10;i>=0;i--) {
			for(int j=9;j>=i;j--) {
			
				if(j%2==0) {
				if(i==10||j==9) {
					System.out.print("0");
				}
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}


