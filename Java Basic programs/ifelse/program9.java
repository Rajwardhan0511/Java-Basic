/*
 Write a program in java to accept three numbers abd check whether they are Pythagorean triplets or not 
 */

class Demo{

	public static void main(String[] args){

		int a=3, b=4, c=5;


		if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b){

			System.out.println("It is a Pythagorean triplet");

		}else{

			System.out.println("It is not a Pythagorean triplet");

		}

	}

}
