/*
 Write a program, and take two characters if these characters are equal then print them as it is but if they are unequal then print their difference.
input: a p
output: The difference between a and p is 15
 */

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter two characters: ");
		char ch1 = (char)br.read();
		br.skip(1);
		char ch2 = (char)br.read();

		if(ch1==ch2) {

			System.out.println("The two charaters are same");
		} else {

			int d=ch1-ch2;

			if(d<0) {

				d=d*(-1);
			}

			System.out.println("The difference between "+ch1+" and "+ch2+" is "+d);
		}
	}
}
