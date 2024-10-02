/*
 Write a program to check whether the number is a palindrome number or not 
 */

class Demo{

	public static void main(String[] args){

		int n=2332;
		int r=0;
		int i=n;

		while(i!=0){

			int a=i%10;
			r=r*10+a;
			i=i/10;
		}
		if(n==r){

			System.out.println(n+" is a palindrome Number");
		}else{

			System.out.println(n+" is not a palindrome Number");
		}
	}
}
