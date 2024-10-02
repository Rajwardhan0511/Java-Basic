import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a number from 1 to 5 : ");
		int num=Integer.parseInt(br.readLine());

		if(num<0)
			num=-1;

		if(num>5)
			num=6;


		switch(num){

			case 0:
				System.out.println("Zero");
				break;

			case 1:
				System.out.println("One");
				break;

			case 2:
				System.out.println("Two");
				break;

			case 3:
				System.out.println("Three");
				break;

			case 4:
				System.out.println("Four");
				break;

			case 5:
				System.out.println("Five");
				break;

			case -1:
				System.out.println("Entered number negative");
				break;

			case 6:
				System.out.println("Entered number is greater than 5");
				break;

		}
	}
}
