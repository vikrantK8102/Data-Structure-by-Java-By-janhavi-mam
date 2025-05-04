package datastructure;

public class intNode {

	private int data;
	private intNode next;
	
	public intNode(){
		data =0;
		next = null;
	}
	
	public intNode(int d){
		data = d;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public intNode getNext() {
		return next;
	}

	public void setNext(intNode next) {
		this.next = next;
	}
	
	 
}
