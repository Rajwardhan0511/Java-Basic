/*
 Write a program to take range as input from the user and print the reverse of all numbers.
Input:
Enter start: 100
Enter end: 200

Output:
Reversed numbers
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int s=Integer.parseInt(br.readLine());

		System.out.print("Enter end: ");
		int e=Integer.parseInt(br.readLine());

		System.out.println("Reversed numbers");

		for(int i=s; i<=e; i++) {

			int num=i;
			int rev=0;

			while(num!=0){

				int r=num%10;
				rev=rev*10+r;
				num /= 10;
			}

			System.out.println(rev);
		}
	}
}
