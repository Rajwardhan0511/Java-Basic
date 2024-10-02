/*
 Calculate profit or loss
 Write a program that takes the cost price and selling price (take it hardcoded) and calculates its profit or loss 
 */

class Demo{

	public static void main(String[] args){

		int sellingPrice=300;
		int costPrice=500;

		if(sellingPrice>costPrice){

			System.out.println("Profit of "+(sellingPrice-costPrice));

		}else if(costPrice>sellingPrice){

			System.out.println("Loss of "+(costPrice-sellingPrice));

		}else{

			System.out.println("No Profit or Loss");

		}

	}

}
