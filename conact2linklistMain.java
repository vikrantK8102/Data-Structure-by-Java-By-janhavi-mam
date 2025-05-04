package datastructure;

import java.util.Scanner;

public class conact2linklistMain {
	
	
	
	public static void main(String[] args) {
		SingleLinkedlist ll1 = new SingleLinkedlist();
		SingleLinkedlist ll2 = new SingleLinkedlist();
		
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println();
			System.out.println("1.insertlast of ll1");
			
			System.out.println("2.insert last of ll2");
			
			System.out.println("3.concat ll1(ll2)");
		
			System.out.println("4.exit");
			System.out.println("---------------------------------");
			System.out.print("enter your choice--->");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:{
				System.out.println("enter data to insert into ll1");
				int data = sc.nextInt();
				ll1.insertLast(data);
				ll1.display();
				break;
				
			}//end of case1
			
			
			
			case 2:{
				System.out.println("enter data to insert into ll1");
				int data = sc.nextInt();
				ll2.insertLast(data);
				System.out.println();
				ll2.display();
				break;
			
			}//end of case 2
			case 3:{
				SingleLinkedlist res =ll1.linklistConcat(ll2);
				res.display();
				break;
				
			}//end of case 3
			
			case 4:{
				System.out.println("exiting....");
				
			}//end of case 3
	
			}
	
		}while(ch!=4);
	}
}
