package datastructure;
import java.util.*;

public class intQueue {

	private int arr[];
	private int front ,rear;
	
	public intQueue() {
		arr = new int[10];
		front = rear = -1;
	}
	
	public intQueue(int d) {
		arr = new int[d];
		front = rear = -1;
	}
	
	public boolean isFullintQ() {
		
		if(rear==arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmptyintQ() {
		if((front==-1)&&(rear-front==1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//insert into queue or Enqueue
	public void insert(int d) {
		if(isFullintQ()) {
	     System.out.println("overflow...");
	}
		if(front==-1) {
			front =0;
		}
		rear = rear+1;
		arr[rear] = d;
		return ;
}
	
	//remove elements from queue
	public int remove(){
		int d = -999;
		if(isEmptyintQ()) {
			System.out.println("underflow..");
			return d;
		}
		d = arr[front];
		front = front+1;
		return d;
	}
	
	//peek/ most front element in queue
	public int peekinQ(){
		int d= -999;
		if(isEmptyintQ()) {
			System.out.println("underflow..");
			return d;
		}
		return arr[front];
	}
	
	//displayqueue
	public void displayQueue() {
		System.out.println("elements in queue is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]+" ");
		}
	}
	
	//main class myqueue to access my queue
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		intQueue que = new intQueue(10);
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
				que.insert(ele);
				que.displayQueue();
				break;
			}//end of case 1
			
			case 2:{
				int removeEle = que.remove();
				System.out.println("remove element in queue is :  "+removeEle);
				break;
			}//end of case 2
			
			case 3:{
				System.out.println("this is elemts in queue :");
				que.displayQueue();
				int peekEle = que.peekinQ();
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
	
}//end of int queue
