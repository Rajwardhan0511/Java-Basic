/*
 Write a program to take a number as input and print the Addition of Factorials of each digit from that number
Input: 1234
Output: Addition of Factorials of each digit from 1234 = 33
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of Rows: ");
		int row = Integer.parseInt(br.readLine());

		int ans=0;
		int w=row;

		while(w!=0) {

			int a = w%10;
			int fact = 1;
		       for(int i=a; i>=1; i--) {

			       fact = fact * i;
		       }
			ans = ans + fact;
			w = w/10;
		}
		System.out.println("Addition of Factorials of each digit from "+row+" = "+ans);
	}
}
