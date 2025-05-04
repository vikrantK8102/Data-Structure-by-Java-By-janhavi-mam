package datastructure;

import java.util.Scanner;

public class characterStack {

	private char arr[];
	private int top;
	
	public characterStack() {
		arr = new char[10];
		top=-1;
	}
	
	public characterStack(int d) {
		arr = new char[d];
		top=-1;
	}
	
	// push char
	public void pushChar(char ch) {
		if(top==arr.length-1) {
			System.out.println("stack is overflow");
			return ;
		}
		else {
			top = top+1;
			arr[top] = ch; 
		}
	}
	
	//pop char
	public char popChar() {
		char d = '#';
		if(top==-1) {
			System.out.println("stack is empty..");
			return d;
		}
		else {
			d = arr[top];
			top = top-1;
			return d;
		}
	}
	
	//peek of charstack
	public char peekChar() {
		char d ='#';
		if(top==-1) {
			System.out.println("stack is empty..");
			return d;
		}
		else {
			return arr[top];
		}
	}
	
public static void main(String[] args) {
		
		
	    characterStack stack1 = new characterStack(5);
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.push");
			
			System.out.println("2.pop");
			
			System.out.println("3.peek");
		
			System.out.println("4.exit");
			System.out.println("---------------------------------");
			System.out.print("enter your choice--->");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:{
				System.out.println("enter char to push into stack ");
				char ch1 = sc.next().charAt(0);
				stack1.pushChar(ch1);;
				break;
			}//end of case1
			
			
			
			case 2:{
				
				System.out.println("pop char at  : " +stack1.peekChar());
				break;
			}//end of case 3
			
			case 3:{
				char c = stack1.peekChar();
				System.out.println("peek char in stack is -->  "+c);
				break;
			}
			
			
			
			case 4:{
				System.out.println("exiting...");
				break;
			}
			}
			
			
		}while(ch!=6);
		
	}
}
