package datastructure;

import java.util.Scanner;

public class myString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how much string put in stack:");
		int d = sc.nextInt();
		stringStack s = new stringStack(d);
		
		for(int i=0;i<d;i++) {
			System.out.println("enter string at"+i+"th position:");
			String enterString = sc.next();
			s.push(enterString);
			
		}
		System.out.println("you succesfully enter all string...");
		
		s.displayStack();
	}
}
