/*
 Write a program to print the following pattern

5 4 3 2 1
8 6 4 2
9 6 3
8 4
5
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of Rows: ");
		int row = Integer.parseInt(br.readLine());

		for(int i=1; i<=row; i++) {

			int a = row-i+1;

			for(int j=row; j>=i; j--) {

				System.out.print(a*i + " ");
				a--;
			}
			System.out.println();
		}
	}
}
