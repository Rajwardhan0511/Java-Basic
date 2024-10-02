/*
 Write a java program that checks a number from 0 to 5 and prints its spelling, if the number is greater than 5 print the number is greater than 5 
*/

class Demo{

	public static void main(String[] args){

		int var=4;

		if(var==0){

			System.out.println("Zero");
		}else if(var==1){

			System.out.println("One");
		}else if(var==2){

			System.out.println("Two");
		}else if(var==3){

			System.out.println("Three");
		}else if(var==4){

			System.out.println("Four");
		}else if(var==5){

			System.out.println("Five");
		}else if(var>5){

			System.out.println("Number is greater than 5");
		}else{

			System.out.println("Number is Negative");
		}

	}
}
