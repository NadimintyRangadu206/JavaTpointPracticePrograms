package com.java.basic.patterns;

/**
12344321
123**321
12****21
1******1
 * @author nadim
 *
 */
public class Pattern4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			if (i == 1) {
				int k = 5;
				int m = 4;
				for (int j = 1; j <= 8; j++) {

					if (j == k) {
						System.out.print(m);
						k++;
						m--;

					} else {
						System.out.print(j);
					}

				}
			} else if (i == 2) {
				int r = 4;
				int s = 7;
				int t = 4;

				for (int l = 1; l <= 8; l++) {

					if (l == r) {
						if (r == 5 || r == s) {
							System.out.print("*");
							r++;

						} else {
							t--;
							System.out.print(t);

							r++;
						}

					} else {
						System.out.print(l);
						s--;

					}
				}
			} else if (i == 3) {
				int r = 3;
				int s = 8;
				int t = 3;

				for (int l = 1; l <= 8; l++) {

					if (l == r) {
						if (r == 3 || r == 4 || r == 5 || r == s) {
							System.out.print("*");

							r++;
						} else {
							t--;
							System.out.print(t);
							s++;
							r++;
						}

					} else {
						System.out.print(l);
						s--;

					}
				}
			} else {
				int p = 2;
				int m = 1;
				for (int x = 1; x <= 8; x++) {

					if (p == x) {
						
						System.out.print("*");
						
						++p;
						
						if(p==8) {
							System.out.print("1");
						}
					} else if (p != x) {
						System.out.print(x);

					}

				}

			}
			System.out.println();
		}

	}

}
