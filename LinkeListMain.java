package LinkedList;

import java.util.Scanner;

public class LinkeListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner sc =new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("1 : AddFirst");
			System.out.println("2 : AddLast");
			System.out.println("3 : AddAtPosition");
			System.out.println("4 : DelFirst");
			System.out.println("5 : DelLast");
			System.out.println("Enter the Choice");
			
			choice=sc.nextInt();
			switch(choice){
			case 1:
					System.out.println("Enter the data ");
				int a=sc.nextInt();
				list.AddFirst(a);
				list.Display();
				System.out.println();
				break;
			case 2:
				System.out.println("Enter the data");
				int b=sc.nextInt();
				list.AddLast(b);
				list.Display();
				System.out.println();
				break;
			case 3:
				System.out.println("Enter the Position");
				int c=sc.nextInt();
				System.out.println("Enter the Data");
				int d= sc.nextInt();
				list.AddAtPosition(c,d);
				list.Display();
				System.out.println();
				break;
			case 4:
				list.DelFirst();
				list.Display();
				System.out.println();
				break;
				
			case 5:
				list.DelLast();
				list.Display();
				System.out.println();
		
			}

	   }while(choice!=0);
		sc.close();
	}
	

}
