/*
 Write a program to count the digits of the given number 
 */


class Demo{

	public static void main(String[] args){

		int n=942111423;
		int count=0;

		while(n!=0){

			count++;
			n=n/10;
		}
		System.out.println("Count of digits = "+count);
	}
}
