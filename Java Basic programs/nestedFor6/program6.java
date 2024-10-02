/*
 Write a program to take 5 number as input from the user and print the count of digits in those numbers.
Input:
25

Output:
The digit count in 25 is 2
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 5 numbers: ");

		for(int i=1; i<=5; i++){
			int num=Integer.parseInt(br.readLine());

			int n=num;
			int count=0;

			while(n!=0){
				count++;
				n /= 10;
			}

			System.out.println("The digit count in "+num+" is "+count);
		}
	}
}
