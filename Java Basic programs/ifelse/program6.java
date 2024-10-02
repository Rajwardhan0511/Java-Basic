/*
 Write a program to find a maximum between three numbers 
 */

class Demo{

	public static void main(String[] args){

		int num1=1;
		int num2=4;
		int num3=4;

		if(num1>num2 && num1>num3){

			System.out.println(num1+" is Maximum between "+num1+", "+num2+" and "+num3);

		}else if(num2>num1 && num2>num3){

			System.out.println(num2+" is Maximum between "+num1+", "+num2+" and "+num3);

		}else if(num3>num1 && num3>num2){

			System.out.println(num3+" is Maximum between "+num1+", "+num2+" and "+num3);

		}else if(num1>num2 && num1==num3){

			System.out.println(num1+" is Greater than "+num1+", "+num2+" and "+num3);

		}else if(num2>num3 && num2==num1){

			System.out.println(num2+" is Greater than "+num1+", "+num2+" and "+num3);

		}else if(num3>num1 && num3==num2){

			System.out.println(num3+" is Greater than  "+num1+", "+num2+" and "+num3);

		}else{

			System.out.println("All Numbers are Equal");

		}
	}
}
