/*
 Write a java program, take a number, and print whether it is positive or 
 negative 
*/

class Demo{

	public static void main(String[] args){

		int num=5;

		if(num>0){

			System.out.println(num+" is a positive number");
		}else if(num<0){
	
			System.out.println(num+" is a negative number");
		}else{

			System.out.println(num+" is Neither Positive nor Negative Number");
		}
	}	
}
