/*
 write a program to print the following pattern

1 2 3 4
2 3 4
3 4
4
 */

class Demo{

	public static void main(String[] args){

		int row=4;

		for(int i=1; i<=row; i++){

			for(int j=i; j<=row; j++){

				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
