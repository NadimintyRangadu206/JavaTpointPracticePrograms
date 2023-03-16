package com.java.basic.patterns;

public class Pattern7 {

	/**
111111111
1       1 
1       1 
1       1 
1       1 
1       1 
1       1 
1       1 
1       1 
111111111
	 * @param args
	 */
	public static void main(String[] args) {

//		for (int i = 1; i <9; i++) {
//			System.out.print("1");
//		}
//		System.out.println();
//		for (int i = 1; i <= 8; i++) {
//			for (int j = 1; j <= 8; j++) {
//
//				if (j == 1 || j == 8) {
//					System.out.print("1");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		for (int i = 1; i < 9; i++) {
//			System.out.print("1");
//		}
		
		
		
	     for (int i = 1; i <= 10; i++)  
	     {  
	         for (int j = 1; j <= 10; j++)  
	         {  
	             if (i==1 || i==10 || j==1 || j==10 )  
	                 System.out.print(" 1");  
	             else  
	                 System.out.print("  ");  
	         }  
	         System.out.println();  
	     }  
	}

}
