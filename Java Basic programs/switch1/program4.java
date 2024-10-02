import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch;

		System.out.println("What is your interest?");
		System.out.println("1. Movies");
		System.out.println("2. Series");
		System.out.println("Enter your choice 1 or 2: ");
		ch = Integer.parseInt(br.readLine());
		switch(ch){

			case 1:{

				       int wish;
				       System.out.println("Movie you wish to watch today");
				       System.out.println("1. Founder");
				       System.out.println("2. Snowden");
				       System.out.println("3. Jobs");
				       System.out.println("4. Her");
				       System.out.println("5. Social Network");
				       System.out.println("6. Wall-E");
				       System.out.println("7. AI");
				       System.out.println("Enter your choice: ");
				       wish = Integer.parseInt(br.readLine());

				       switch(wish){

					       case 1:
						       System.out.println("You wished to watch Founder movie");
						       break;

					       
					       case 2:
						       System.out.println("You wished to watch Snowden movie");
						       break;

					       
					       case 3:
						       System.out.println("You wished to watch Jobs movie");
						       break;

					       case 4:
						       System.out.println("You wished to watch Her movie");
						       break;

					       case 5:
						       System.out.println("You wished to watch Scoial Network movie");
						       break;

					       case 6:
						       System.out.println("You wished to watch Wall-E movie");
						       break;

					       case 7:
						       System.out.println("You wished to watch AI movie");
						       break;

					       default:
						       System.out.println("Invalid Choice");
						       break;
				       }
			}
			break;

			case 2:{
				       int wish;
				       System.out.println("Best series to watch");
				       System.out.println("1. Silicon Valley");
				       System.out.println("2. Devs");
				       System.out.println("3. The IT croed");
				       System.out.println("4. Mr Robot");
				       System.out.println("Enter your choice: ");
				       wish = Integer.parseInt(br.readLine());

				       switch(wish){

					       case 1:
						       System.out.println("You wished to watch Silicon Valley Series");
						       break;


					       case 2:
						       System.out.println("You wished to watch Devs Series");
						       break;

					       case 3:
						       System.out.println("You wished to watch The IT croed Series");
						       break;

					       case 4:
						       System.out.println("You wished to watch Mr Robot Series");
						       break;


					       default:
						       System.out.println("Invalid Choice");
						       break;
				       }
			}
			break;

			default:
				System.out.println("Invalid Choice");
				break;

		}
	}
}
