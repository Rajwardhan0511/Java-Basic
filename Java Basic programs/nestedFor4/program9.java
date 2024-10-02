/*
 write a program to print the following pattern

1
8 9
27 16 125
64 25 216 49
 */

class Demo{

	public static void main(String[] args){

		int row=4;

		for(int i=1; i<=row; i++){

			int a=i;

			for(int j=1; j<=i; j++){
				
				if(j%2==1){

					System.out.print(a*a*a+" ");
				}else{

					System.out.print(a*a+" ");
				}
				a++;
			}
			System.out.println();
		}
	}
}
