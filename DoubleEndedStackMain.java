package datastructure;

import java.util.Scanner;

public class DoubleEndedStackMain {

	public static void main(String[] args) {
		
		
		DoubleEndedStack stack1 = new DoubleEndedStack(10);
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.pushA");
			System.out.println("2.pushB");
			System.out.println("3.popA");
			System.out.println("4.popB");
			System.out.println("5.peekA");
			System.out.println("6.peekB");
			System.out.println("7.exit");
			System.out.println("---------------------------------");
			System.out.print("enter your choice--->");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:{
				System.out.println("enter elemt to push at top A");
				int ele  = sc.nextInt();
				stack1.pushA(ele);
				break;
			}//end of case1
			
			case 2:{
				System.out.println("enter elemt to push at top A");
				int ele  = sc.nextInt();
				stack1.pushB(ele);
				break;
			}//end of case2
			
			case 3:{
				
				System.out.println("pop at A : " +stack1.popA());
				break;
			}//end of case 3
			
			case 4:{
				stack1.popB();
				break;
			}
			case 5:{
				System.out.println("peek at A is:  "+stack1.peekA());
			
				break;
			}//end of case 5
			
			case 6:{
				System.out.println("peek at A is:  "+stack1.peekB());
			    break;
			}//end of case 6
			
			
			case 7:{
				System.out.println("exiting...");
				break;
			}
			}
			
			
		}while(ch!=6);
		
	}
}
