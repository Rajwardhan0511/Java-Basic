/*
 Write a program to reverse the given number 
 */


class Demo{

	public static void main(String[] args){

		int n=942111423;
		int rev=0;

		while(n!=0){

			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println(rev);
	}
}
