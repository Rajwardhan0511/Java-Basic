/*
 Write a program to print all even no. in reverse order and odd no. in the standard way. Both separately. 
 With in a range. Take the start and end from user

Input:
 Enter Start number: 2
 Enter End number: 9
Output:
  8 6 4 2
  3 5 7 9
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Start Number: ");
		int s = Integer.parseInt(br.readLine());

		System.out.print("Enter End Number: ");
		int e = Integer.parseInt(br.readLine());

		System.out.println("Even Numbers: ");

		for(int i=e; i>=s; i--) {

			if(i%2==0) {

				System.out.print(i+" ");
			}
		}

		System.out.println();
		System.out.println("Odd Numbers:");

		for(int i=s; i<=e; i++) {

			if(i%2==1) {

				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
