/*
 Write a unique real-time example of If ElseIf Else Ladder 
 */

class Demo{

	public static void main(String[] args){

		int marks=50;

		if(marks>=90 && marks<=100){

			System.out.println("Pass with Distinction");

		}else if(marks>=35 && marks<90){

			System.out.println("Pass");

		}else if(marks<35 && marks>=0){

			System.out.println("Fail");

		}else{

			System.out.println("Invalid Marks");

		}

	}

}
