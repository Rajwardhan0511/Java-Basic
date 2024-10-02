/*
 write a program to print the following pattern

 1 2 3 4 
 4 5 6 
 6 7 
 7
 */

class Demo{

	public static void main(String[] args){

		int row=4;
		int num=1;

		for(int i=1; i<=row; i++){

			for(int j=i; j<=row; j++){

				System.out.print(num+" ");
				num++;
			}
			num--;
			System.out.println();
		}
	}
}
