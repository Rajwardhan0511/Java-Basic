/*
 Write a program to print a series of prime no from entered range 
 Take the start and end no from user

Input:
 Enter Start number: 1
 Enter End number: 10
Output:
  Series = 3 5 7
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Start Number: ");
		int s = Integer.parseInt(br.readLine());

		System.out.print("Enter End Number: ");
		int e = Integer.parseInt(br.readLine());

		System.out.print("Series = ");

		for(int i=s; i<=e; i++) {

			int count=0;

			for(int j=1; j<=i; j++) {

				if(i%j==0) {

					count++;
				} else if(count > 2) {

					break;
				}
			}

			if(count==2) {

				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
