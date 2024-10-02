/*
 Write a program to take range as input from the user and print perfect number.
Input:
Enter start: 1
Enter end: 100

Output:
Perfect between 1 and 100
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int s=Integer.parseInt(br.readLine());

		System.out.print("Enter end: ");
		int e=Integer.parseInt(br.readLine());

		System.out.println("Perfect between "+s+" and "+e);

		for(int i=s; i<=e; i++) {

			int sum=0;
			for(int j=1; j<i; j++) {

				if(i%j==0){
					sum += j;
				}
			}

			if(sum==i){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
