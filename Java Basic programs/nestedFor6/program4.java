/*
 Write a program to take range as input from the user and print perfect cubes b/w that range.
Input:
Enter start: 1
Enter end: 100

Output:
Perfect Cube between 1 and 100
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int s=Integer.parseInt(br.readLine());

		System.out.print("Enter end: ");
		int e=Integer.parseInt(br.readLine());

		System.out.println("Perfect Cube between "+s+" and "+e);

		for(int i=s; i<=e; i++) {

			for(int j=1; j*j<=i; j++) {

				if(j*j*j==i) {

					System.out.print(i+" ");
				}
			}
		}
		System.out.println();
	}
}
