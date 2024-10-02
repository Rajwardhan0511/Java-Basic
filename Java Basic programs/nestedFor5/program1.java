/*
 Write a program to print the following pattern
D4 C2 B2 A1
A1 B2 C3 D4
D4 C2 B2 A1
A1 B2 C3 D4
 */

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number of Rows: ");
		int row = Integer.parseInt(br.readLine());

		int num=row;
		int ch=row+64;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(i%2==1){

					System.out.print((char) ch + "" + num +" ");
					ch--;
					num--;
				} else {

					System.out.print((char) ch + "" + num + " ");
					ch++;
					num++;
				}
			}

			if(i%2==1){

				ch++;
				num++;
			} else {

				ch--;
				num--;
			}

			System.out.println();
		}


	}
}
