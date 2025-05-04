package datastructure;

public class DoubleEndedStack {

	//also called 2c stack
	private int arr[];
	private int topA ,topB;
	
	public DoubleEndedStack() {
		arr = new int[10];
		topA = -1;
		topB = arr.length; //that is 10 //b at last index
		
	}
	
	public DoubleEndedStack(int d) {
		arr = new int[d];
		topA = -1;
		topB = arr.length;
		
	}
	
	//isfull condition
	public boolean isFull() {
		
		if(topB -topA == 1) {
			return true;
		}
	
    else {
    	return false;
    }
  }
	
	//isempty for A
	public boolean isEmptyA() {
		if(topA == arr.length) {
			System.out.println("stack is underflow on A side");
			return true;
		}
		
		
		else
			return false;
	}
	
	//isEmpty for B
	public boolean isEmptyB() {
		if(topA == -1) {
			System.out.println("stack is underflow on B side");
			return true;
		}
			
		else
			return false;
	}
	
	//push A
	public void pushA(int d) {
		if(!isFull()) {  //if stack is not full
			topA = topA+1;
			arr[topA] = d;
		}
		
		System.out.println("stack is overflow");
		return ;  //means , stack full then return 
	}
	
	//push B
	public void pushB(int d) {
		if(!isFull()) {
			topB = topB -1;
			arr[topB] = d;
		}
		System.out.println("stack is overflow");
		return ;  //means  stack full then ,return 
	}
	
	//pop A
	public int popA(){
		
		int d = -999;
		if(!isEmptyA()) {
			
			d = arr[topA];
			topA = topA-1;
		}
		return d;
	}
	
	//pop B
	public int popB() {
		
		int d = -999;
		if(!isEmptyB()) {
			
			d = arr[topB];
			topB = topB +1;
		}
		return d;
	}
	
	//peekA
	public int peekA() {
		
		int d = -999;
		if(!isEmptyA()) {
			System.out.println("underflow on A side");
			return d;
		}
		return arr[topA];
	}
	
	//peek B
	public int peekB() {
		
		int d =-999;
		if(!isEmptyB()) {
			
			System.out.println("underflow on B side");
			return d;
		}
		return arr[topB];
	}
}	
