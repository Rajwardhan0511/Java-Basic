import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Marks of English: ");
		int eng=Integer.parseInt(br.readLine());


		System.out.print("Enter Marks of Marathi: ");
		int mar=Integer.parseInt(br.readLine());

		System.out.print("Enter Marks of Maths: ");
		int math=Integer.parseInt(br.readLine());
		
		System.out.print("Enter Marks of Phy: ");
		int phy=Integer.parseInt(br.readLine());

		System.out.print("Enter Marks of Chem: ");
		int chem=Integer.parseInt(br.readLine());

		if(eng>35 && mar>35 && math>35 && phy>35 && chem>35){

			int per=(eng+mar+math+phy+chem)/5;
			char ch;

			if(per>75)
				ch='A';

			else if(per>60)
				ch='B';

			else if(per>50)
				ch='C';
			
			else if(per>40)
				ch='D';
			
			else if(per>=35)
				ch='E';
			
			else
				ch='F';

			switch(ch){

				case 'A':
					System.out.println("First Class with Distinction");
					break;

				case 'B':
					System.out.println("First Class");
					break;

				case 'C':
					System.out.println("Second Class");
					break;

				case 'D':
					System.out.println("Third Class");
					break;

				case 'E':
					System.out.println("Pass");
					break;

				case 'F':
					System.out.println("Fail");
					break;

			}

		}else{

			System.out.println("You failed in exam");
		}

	}
}
