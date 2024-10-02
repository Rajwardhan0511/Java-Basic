/*
 write a program to print the following pattern

F
E 1
D 2 E
C 3 D 4
B 5 C 6 D
A 7 B 8 C 9
 */

class Demo{

	public static void main(String[] args){

		int row=6;
		int n=1;
		char ch='F';

		for(int i=1; i<=row; i++){

			char temp=ch;

			for(int j=1; j<=i; j++){

				if(j%2==1){

					System.out.print(temp+" ");
					temp++;
				}else{

					System.out.print(n+" ");
					n++;
				}
			}
			ch--;
			System.out.println();
		}
	}
}
