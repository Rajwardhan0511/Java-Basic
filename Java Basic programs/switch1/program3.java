
import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter First Number: ");
		int n1 = Integer.parseInt(br.readLine());


		System.out.print("Enter Second Number: ");
		int n2 = Integer.parseInt(br.readLine());

		if(n1>0 && n2>0){

			int mul=n1*n2;

			switch(mul%2){

				case 0:
					System.out.println("Even");
					break;

				case 1:
					System.out.println("Odd");
			}
		}else{

			System.out.println("Sorry negative numbers not allowed");
		}
	}
}
