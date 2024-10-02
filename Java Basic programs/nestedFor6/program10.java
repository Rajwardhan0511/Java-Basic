/*
 Write a program to take range as input from the user and print Armstrong numbers
Input:
Enter start: 1
Enter end: 1650

Output:
Armstrong numbers between 1 and 1650
1 2 3 4 5 6 7 8 9 153 370 371 407 1634
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int s=Integer.parseInt(br.readLine());

		System.out.print("Enter end: ");
		int e=Integer.parseInt(br.readLine());

		System.out.println("Armstrong numbers between "+s+" and "+e);

		for(int i=s; i<=e; i++) {

			int num=i;
			int sum=0;
			int count=0;

			while(num!=0){

				count++;
				num /= 10;
			}
			num=i;

			while(num!=0){

				int mult=1;
				int rem=num%10;
				for(int j=1; j<=count; j++){
					mult = mult * rem;
				}

				sum += mult;
				num /= 10;
			}
			
			if(sum==i){

				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
