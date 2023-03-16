package com.java.basic.patterns;
/**
 A
B B
C C C
D D D D
E E E E E
 *
 */




public class CharacterPattern1 {

	public static void main(String[] args) {
//		char ch;
		

		
		for( int i=1,ch='A'; i<=5;i++,ch++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=1;i<=5;i++) {
			for(int j=1, ch='A';j<=i;j++,ch++) {
				System.out.print((char)ch+" ");
			}
			System.out.println();
		}
	}

}
