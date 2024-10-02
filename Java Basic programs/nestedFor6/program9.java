/*
 Write a program to print a series of strong numbers from entired range.
Input:
Enter start: 1
Enter end: 150

Output:
Strong numbers between 1 and 150
1 2 145
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int s=Integer.parseInt(br.readLine());

		System.out.print("Enter end: ");
		int e=Integer.parseInt(br.readLine());

		System.out.println("Strong numbers between "+s+" and "+e);

		for(int i=s; i<=e; i++) {

			int num=i;
			int sum=0;

			while(num!=0){

				int rem=num%10;
				int fact=1;

				for(int j=1; j<=rem; j++){
					fact = fact * j;
				}

				sum += fact;
				num /= 10;
			}
			
			if(sum==i){

				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
