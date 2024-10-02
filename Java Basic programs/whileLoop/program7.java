/*
 Write a program which takes number from users if number is even print that number in reverse order or if number is odd print that number in reverse order by difference two 
 */

class Demo{


	public static void main(String[] args){

		int n=7;
		int i=n;

		while(i>=1){

			if(n%2==0){

				System.out.println(i);
				i--;

			}else{

				System.out.println(i);
				i=i-2;
			}
		}

	}	
}
