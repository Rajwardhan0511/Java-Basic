/*
 Write a program to print the square of even digits of the given number 
 */


class Demo{

	public static void main(String[] args){

		int n=942111423;

		while(n!=0){

			int a=n%10;

			if(a%2==0){

				System.out.println(a*a);
			}
			n=n/10;
		}
	}
}
