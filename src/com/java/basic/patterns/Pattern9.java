package com.java.basic.patterns;

public class Pattern9 {
/**	
      *  *  *  *  *  *  *  *  * 
	  
	    *  *  *  *  *  *  * 
	    
	      *  *  *  *  * 
	      
	        *  *  * 
	        
	          * 
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			if (i % 2 != 0) {
				for (int j = i; j <= 9; j++) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=9;i++) {
			for(int k=8;k>=i;k--) {
				System.out.print(" ");
			}
			if(i%2!=0) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			}
			System.out.println();
		}

	}

}
