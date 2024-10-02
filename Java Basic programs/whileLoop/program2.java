/*
 Write a program to calculate the factorial of the given number 
 */


class Demo{

	public static void main(String[] args){

		int i=1;
		int f=1;
		int n=6;

		while(i<=n){

			f=f*i;
			i++;
		}
		System.out.println("Factorial of "+n+" is "+f);
	}
}
