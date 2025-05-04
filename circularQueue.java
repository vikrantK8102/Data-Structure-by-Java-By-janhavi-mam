package datastructure;

import java.util.Scanner;

public class circularQueue {

	private int arr[];
	private int rear,front;
	
	public circularQueue() {
		arr = new int[10];
		front=rear=-1;
    }
	
	public circularQueue(int d) {
		arr = new int[d];
		front=rear=-1;
    }
	
	public boolean isFullCQ() {
		if(((front==0)&&(rear==arr.length-1))||(front-rear==1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmptyCQ() {
		if(front==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertinCQ(int data) {
		if(isFullCQ()) {
			System.out.println("queue is overflow");
		}
		else {
			if(front==-1) {
				front=0;
			}
			if(rear==arr.length-1) {
				rear=0;
			}
			else {
				rear= rear+1;
			}
			arr[rear]=data;
		}
	}
	
	public int removeFromCQ() {
		int d =-999;
		if(isEmptyCQ()) {
			System.out.println("queue is underflow");
			return d;
		}
		else {
			d = arr[front];
			front= front+1;
			return d;
		}
	}
	
	public int peekFromCQ() {
		int d = -999;
		if(isEmptyCQ()) {
			System.out.println("queue is underflow");
			return d;
		}
		else {
			return arr[front];
		}
	}
	//displayqueue
		public void displayCQueue() {
			System.out.println("elements in queue is:");
			for(int i=0;i<arr.length;i++) {
				System.out.print(" "+arr[i]+" ");
			}
		}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("enter elemts to enter into queue:");
		int d = sc.nextInt();
		circularQueue cq = new circularQueue(d);
		
		do {
			System.out.println("\n--------- MENU ---------");
			System.out.println("1. insert");
			System.out.println("2. remove");
			System.out.println("3. peek");
			
			System.out.println("4. Exit");
			System.out.println("------------------------");
			System.out.print("Enter your choice --> ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:{
				
				System.out.println("enter elemet to insert into intqueue:");
				int ele = sc.nextInt();
				cq.insertinCQ(ele);
				cq.displayCQueue();
				break;
			}//end of case 1
			
			case 2:{
				int removeEle = cq.removeFromCQ();
				System.out.println("remove element in queue is :  "+removeEle);
				break;
			}//end of case 2
			
			case 3:{
				System.out.println("this is elemts in queue :");
				cq.displayCQueue();;
				int peekEle = cq.peekFromCQ();
				System.out.println("peek or most front elemet is:  "+peekEle);
				break;
			}//case 3 end
			
			case 4:{
				System.out.println("exiting...");
				break;
			}//end of case 4
            }
		}while(ch!=4);  //end of do-while
	}//end of main
	
	}
   

