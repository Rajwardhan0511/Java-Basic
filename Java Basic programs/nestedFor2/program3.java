/*
 Write a program to print the following pattern

14 15 16 17
15 16 17 18
16 17 18 19
17 18 19 20
 */


class Demo{

	public static void main(String[] args){

		for(int i=1; i<=4; i++){

			int n=i+13;

			for(int j=1; j<=4; j++){

				System.out.print(n+" ");
				n++;
			}

			System.out.println();
		}
	}
}
