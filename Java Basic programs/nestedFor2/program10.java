/*
 Write a program to print the following pattern

F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
 */


class Demo{

	public static void main(String[] args){

		for(int i=1; i<=6; i++){

			char ch='F';
			int n=6;

			for(int j=1; j<=6; j++){

				if(j%2==1){

					System.out.print(ch + " ");
				}else{

					System.out.print(n+" ");
				}
				n--;
				ch--;
			}

			System.out.println();
		}
	}
}
