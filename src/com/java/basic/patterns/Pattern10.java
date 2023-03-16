package com.java.basic.patterns;

public class Pattern10 {

	public static void main(String[] args) {
		
		int sum=1;
		for(int i=1;i<=6;i++) {
			
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				
				if(j==1||i==1) {
			
               System.out.print(j+" ");
				}
				else {
				System.out.print((i*(i-j)+1)+" ");
				}
				}
			
			System.out.println();
		}
		}

	}


