/*
 Write a program to print the product of the first 10 numbers 
 */

class Demo{

	public static void main(String[] args){

		int mult=1;

		for(int i=1; i<=10; i++){

			mult = mult * i;
		}

		System.out.println("Product of First 10 numbers is "+mult);
	}
}
