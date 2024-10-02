/*
 Write a program to take range as input from the user and print palindrome numbers.
Input:
Enter start: 100
Enter end: 250

Output:
Palindrome numbers between 100 and 250
101 111 121 131 141 151 161 171 181 191 202 212 222 232 242 
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int s=Integer.parseInt(br.readLine());

		System.out.print("Enter end: ");
		int e=Integer.parseInt(br.readLine());

		System.out.println("Palindrom numbers between "+s+" and "+e);

		for(int i=s; i<=e; i++) {

			int num=i;
			int rev=0;

			while(num!=0){

				int r=num%10;
				rev=rev*10+r;
				num /= 10;
			}

			if(rev==i){

				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
