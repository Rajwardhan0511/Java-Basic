/*
 write a program to print the following pattern

 10 10 10 10
 11 11 11
 12 12
 13
 */

class Demo{

	public static void main(String[] args){

		int row=4;
		int num=10;

		for(int i=1; i<=row; i++){

			for(int j=i; j<=row; j++){

				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}
	}
}
