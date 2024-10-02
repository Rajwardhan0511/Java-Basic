/*
 write a program to print the following pattern

 3C 3C 3C 3C
 3C 3C 3C
 3C 3C
 3C
 */

class Demo{

	public static void main(String[] args){

		int row=4;

		for(int i=1; i<=row; i++){

			for(int j=i; j<=row; j++){

				System.out.print("3C ");
			}
			System.out.println();
		}
	}
}
