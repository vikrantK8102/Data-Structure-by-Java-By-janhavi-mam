package datastructure;

import java.util.Scanner;

public class SingleLinkedlist {
	
   private intNode head;  
   
   public SingleLinkedlist() {
	    head = null;
	}
   
   public intNode getHead() {
		return head;
	}


	public void setHead(intNode head) {
		this.head = head;
	}
    
   //insert first function
    public void insertFirst(int d) {
    	
    	intNode newNode = new intNode(d);
    	if(head==null) {
    		head = newNode;
    		return;
    	}
    	
    	newNode.setNext(head);
    	head = newNode;
    	return ;
    	
    }
    
    //insert last function
    public void insertLast(int d) {
    	
    	intNode newNode = new intNode(d);
    	if(head==null) {
    		head = newNode;
    		return;
    	}
    	intNode iter = head;
    	while(iter.getNext()!=null) {
    		iter = iter.getNext();
    		return;
    	}
    	iter.setNext(newNode);
    }
    
    //insert by position
    public void insertbyPos(int d,int pos){
    	
    	intNode newNode = new intNode(d);
    	if(head==null) {
    		head = newNode;
    		return ;
    	}
    	
    	intNode iter = head;
    	int i;
    	for(i=1;i<pos-1 && iter.getNext()!=null;i++,iter = iter.getNext());
    	
    	newNode.setNext(iter.getNext());
    	iter.setNext(newNode);
    	return;
    	
    }
    
    //delete by position
    public int deletebyPos(int pos) {
    	int d =-999;
    	if(head==null) {
    		return d;
    	}
    	
    	if(head.getNext()==null) {
			d=head.getData();
			head = null;
			return d;
		}
    	
    	if(pos==1) {
			d = head.getData();
			head = head.getNext();
			return d;
		}
    	intNode iter = head;
		for(int i=1; i<pos-1 && iter.getNext()!=null; i++,iter=iter.getNext());
		if(iter.getNext()!=null)
		{
			d = iter.getNext().getData();
			iter.setNext(iter.getNext().getNext());
		
		}
		return d;
    }
    
    //insert before given data  function
    public void insert_before(int d, int key) {
		intNode new_node = new intNode(d);
		if(head == null) {
			head = new_node;
			return ;
		}
		if(head.getData()==key) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		intNode iter = head;
		while(iter.getNext()!=null && iter.getNext().getData()!=key) {
			iter = iter.getNext();
			if(iter.getNext()==null) {
				System.out.println("Invalid key");
				return;
			}
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			return;
		}
    
    }
    
    //delete first
    public int deleteFirst() {
		int d = -999;
		if (head == null)
			return d;
		d = head.getData();
		head = head.getNext();
		
		return d;
	}
	
    //delete last
	public int deleteLast() {
		int d;
		if(head==null) {
			return -999;
		}
		if(head.getNext()==null) {
			d = head.getData();
			head = null;
			return d;
		}
		intNode iter = head;
		while(iter.getNext().getNext()!=null) {
			iter = iter.getNext();
		}
			
		d = iter.getNext().getData();
		iter.setNext(null);
		return d;
	}
	
	//insert after by using key = given data
	public void insert_after(int d,int key) {
		  intNode new_node = new intNode(d);
		  if(head == null) {
			  head = new_node;
			  return;
		  }
		  intNode iter = head;
		  while(iter!=null && iter.getData()!=key)
			  iter = iter.getNext();
		   if(iter==null) {
			  System.out.println("Invalid Key");
			  return;
		   }
		   new_node.setNext(iter.getNext());
		   iter.setNext(new_node);
		   return;
	  }
	
	//insert while sorting..
	public void insert_while_sorting(int d) {
		
		intNode newNode = new intNode(d);
		if((head==null) ||( d <head.getData())) {
			newNode.setNext(head);
			head = newNode;
			return;
			}
		intNode iter = head;
		while(iter.getNext()!=null && (iter.getNext().getData()<d)){
			iter = iter.getNext();
		}
		newNode.setNext(iter.getNext());
		iter.setNext(newNode);
	}
	
	//linkedlist concat
	public SingleLinkedlist linklistConcat(SingleLinkedlist ll2) {
	    SingleLinkedlist res = new SingleLinkedlist();

	    intNode iter = head;
	    while (iter != null) {
	        res.insertLast(iter.getData());
	        iter = iter.getNext();
	    }

	    iter = ll2.getHead();  // You need a getHead() method for this to work
	    while (iter != null) {
	        res.insertLast(iter.getData());
	        iter = iter.getNext();
	    }

	    return res; 
	}
	    /*
	     Given:

List 1 (this):
    head
     |
     v
    [1] -> [2] -> [3] -> null

List 2 (ll2):
    head
     |
     v
    [4] -> [5] -> null

------------------------------------------

Step-by-step (linklistConcat):

1. Create empty list: res

2. Copy List 1 into res:
   res: [1] -> [2] -> [3] -> null

3. Copy List 2 into res:
   res: [1] -> [2] -> [3] -> [4] -> [5] -> null

------------------------------------------

Final Output (returned 'res'):

res:
    head
     |
     v
    [1] -> [2] -> [3] -> [4] -> [5] -> null
*/ 
	


	//display linklist 
	public void display() {
		if (head == null) {
			System.out.print("LinkedList is Empty");
			return;
		}
		System.out.println("LinkedList : ");
		intNode iter = head;
		while (iter != null) {
			System.out.print(iter.getData() + " -> ");
			iter = iter.getNext();
		}
	}
    
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		SingleLinkedlist ll = new SingleLinkedlist();
		int ch;
		do {
			System.out.println("1.Insert First");
			System.out.println("2.Insert Last");
			System.out.println("3.Delete First");
			System.out.println("4.Delete Last");
			System.out.println("5.Insert By Position");
			System.out.println("6.Delete By Position");
			System.out.println("7.Insert Before");
			System.out.println("8.Insert After");
			System.out.println("9.Display");
			System.out.println("10.Exit");
			System.out.println("Enter the Choice: ");
			ch = s.nextInt();
			
		switch(ch) {
		case 1:{
			System.out.println("Insert First");
			System.out.println("Enter The element to insert in LikedList: ");
			int d = s.nextInt();
			ll.insertFirst(d);
			break;
		}
		case 2:{
			System.out.println("Insert Last");
			System.out.println("Enter The element to insert in LikedList: ");
			int d = s.nextInt();
			ll.insertLast(d);
			break;
		}
		case 3:{
			System.out.println("Delete the First element");
			ll.deleteFirst();
			break;
		}
		case 4:{
			System.out.println("Delete the Last element");
			ll.deleteLast();
			break;
		}
		case 5:{
			System.out.println("Insert By Position");
			System.out.println("Enter The element to insert in LikedList: ");
			int d = s.nextInt();
			System.out.println("Enter The Position to insert in LikedList: ");
			int pos = s.nextInt();
			ll.insertbyPos(d, pos);
			break;
		}
		case 6:{
			System.out.println("Delete By Position");
			System.out.println("Enter The Position to insert element in LikedList: ");
			int pos = s.nextInt();
			ll.deletebyPos(pos);
			break;
		}
		case 7:{
			System.out.println("Insert Before");
			System.out.println("Enter The element to insert in LikedList: ");
			int d = s.nextInt();
			System.out.println("Enter The key: ");
			int key = s.nextInt();
			ll.insert_before(d, key);
			break;
		}
		case 8:{
			System.out.println("Insert After");
			System.out.println("Enter The element to insert in LikedList: ");
			int d = s.nextInt();
			System.out.println("Enter The key: ");
			int key = s.nextInt();
			ll.insert_after(d, key);;
			break;
		}
		case 9:{
			System.out.println("LinkedList Elements:");
			ll.display();
			break;
		}
		case 10:{
			System.out.println("Exited ");
			break;
		}
		}
		}while(ch!=11);
		
		
		
		
	}
	
	
		
		
}
