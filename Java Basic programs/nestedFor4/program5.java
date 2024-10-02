/*
 write a program to print the following pattern

A B C D
B C D
C D
C
 */

class Demo{

	public static void main(String[] args){

		int row=4;
		char ch='A';

		for(int i=1; i<=row; i++){

			char a=ch;

			for(int j=i; j<=row; j++){

				System.out.print(a+" ");
				a++;
			}
			ch++;
			System.out.println();
		}
	}
}
